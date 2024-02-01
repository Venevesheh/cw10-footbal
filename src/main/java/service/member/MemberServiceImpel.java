package service.member;

import base.service.BaseServiceImpel;
import model.Member;
import repository.member.MemberRepository;

import java.sql.Connection;
import java.sql.ResultSet;

public class MemberServiceImpel extends BaseServiceImpel <Integer, Member, MemberRepository>  implements MemberService {
    public MemberServiceImpel(MemberRepository repository) {
        super(repository);
    }


    @Override
    public ResultSet maxCoachsalary() {
        return repository.maxCoachSalary();
    }
}
