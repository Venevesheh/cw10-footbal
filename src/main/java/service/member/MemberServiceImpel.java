package service.member;

import base.service.BaseServiceImpel;
import model.Member;
import repository.member.MemberRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberServiceImpel extends BaseServiceImpel <Integer, Member, MemberRepository>  implements MemberService {
    public MemberServiceImpel(MemberRepository repository) {
        super(repository);
    }


    @Override
    public void maxCoachsalary() {
        try {
            ResultSet resultSet = repository.maxCoachSalary();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("name") + " | ");
                System.out.println(resultSet.getInt("salary") + " | ");
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
