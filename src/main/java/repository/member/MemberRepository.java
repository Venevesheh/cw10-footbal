package repository.member;

import base.repository.BaseRepository;
import model.Member;

import java.sql.ResultSet;

public interface MemberRepository extends BaseRepository<Integer, Member> {
     ResultSet maxCoachSalary();
     ResultSet maxPlayerInSemester();
}
