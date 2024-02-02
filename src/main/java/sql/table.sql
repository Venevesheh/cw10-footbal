create table if not exists city(
    id   serial primary key,
    name varchar(100)
);
create table if not exists stadium
(
    id      serial primary key,
    name    varchar(100),
    city_id int references city (id)
);
create table if not exists team
(
    id         serial primary key,
    name       varchar(100),
    city_id    int references city (id),
    stadium_id int references stadium (id)

);
create table if not exists semester
(
    id         serial primary key,
    start_date date,
    end_date   date
);

create table if not exists matches
(
    id               serial primary key,
    host_team_id     int references team (id),
    guest_team_id    int references team (id),
    stadium_id       int references stadium (id),
    winner_id        int references team (id),
    goals_count      int,
    host_team_score  int references score (id),
    guest_team_score int references score (id),
    semester_id      int references semester (id)
);


create table if not exists goal
(
    id         serial primary key,
    member_id  int references member (id),
    matches_id int references matches (id)

);
create table if not exists score
(
    id          serial primary key,
    team_id     int references team (id),
    semester_id int references semester (id),
    total_score int
);

create table if not exists member
(
    id      serial primary key,
    name    varchar(100),
    role    varchar(10),
    team_id int references team (id)

);
create table if not exists contract
(
    id         serial primary key,
    member_id  int references member (id),
    semester_id int references semester(id),
    salary     int
);

--the query of coach's maximum salary
select m.name ,salary from member m,contract c
where c.member_id =m.id and c.salary=(select max(salary ) from contract );



--the query of coach's maximum salary
select m.role, m.name, c.salary
from member m,
     contract c
where m.id = c.member_id
  and c.salary = (select max(salary)
                  from contract c
                           join member m2 on m2.id = c.member_id
                  where m2.role = 'player');



select m.name, c.salary, c.semester_id, m.role
from contract c,
     member m
where m.id = c.member_id
  and (c.semester_id, c.salary)
    in (select c.semester_id, max(salary)
        from contract c,
             member m2
        where m2.role = 'player'
        group by c.semester_id, c.salary
        having c.salary = max(c.salary));


select m.name, c.salary, c.semester_id, m.role
from contract c,
     member m
where m.id = c.member_id
  and (c.semester_id, c.salary)
    in (select c.semester_id,
               max(salary)
        from contract c,
             member m2
        where c.salary = (select max(c.salary)
                          from contract c,
                               member m
                          where m.role = 'player')
        group by c.semester_id);



(select c.salary
 from contract c,
      member m
 where m.role = 'player');


select m.name, c.salary, c.semester_id, m.role
from contract c,
     member m
where m.id = c.member_id
  and (c.semester_id, c.salary)
    in (select c.semester_id,
               max(salary)
        from contract c,
             member m2
        group by c.semester_id);



select m.name, c.salary, c.semester_id, m.role
from contract c,
     member m
where m.role = 'player'
  and c.member_id = m.id
  and c.salary = (select max(salary) from contract)


select m.role, m.name, c.salary,c.semester_id
from member m,
     contract c,
     semester s
where m.id = c.member_id
  and c.salary = (select max(salary)
                  from contract c
                           join member m2 on m2.id = c.member_id
                           join  semester s2 on c.semester_id = s2.id
                  where m2.role = 'player');



select m.role, m.name, c.salary, c.semester_id
from member m,
     contract c
where m.id = c.member_id
  and c.salary = (select max(salary)
                  from contract c
                           join member m2 on m2.id = c.member_id
                  where m2.role = 'player'
                    and c.semester_id in (1, 2))


group by c.semester_id, m.name, c.salary, m.role;


