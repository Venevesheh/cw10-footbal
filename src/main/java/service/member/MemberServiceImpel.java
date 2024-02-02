package service.member;

import base.service.BaseServiceImpel;
import model.Member;
import repository.member.MemberRepository;

import java.io.IOException;
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

    @Override
    public void maxPlayerInSemester() {
        try {
            ResultSet resultSet = repository.maxPlayerInSemester();
            while (resultSet.next()) {
                System.out.print(resultSet.getString("role") + " | ");
                System.out.print(resultSet.getString("name") + " | ");
                System.out.print(resultSet.getInt("salary") + " | ");
                System.out.println(resultSet.getInt("semester_id") + " | ");
            }
        } catch (Exception e){
            System.out.println("this is service "+e.getMessage());
        }
    }
}
