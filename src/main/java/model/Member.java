package model;

import base.model.BaseEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Member extends BaseEntity<Integer> {
     String name;
     String role;
     int teamId ;

     public Member(Integer id, String name, String role, int teamId) {
          super(id);
          this.name = name;
          this.role = role;
          this.teamId = teamId;
     }
}

