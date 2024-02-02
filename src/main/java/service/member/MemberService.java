package service.member;

import base.service.BaseService;
import model.Member;

import java.sql.ResultSet;

public interface MemberService extends BaseService<Integer, Member> {

    void maxCoachsalary();
    void maxPlayerInSemester();
}
