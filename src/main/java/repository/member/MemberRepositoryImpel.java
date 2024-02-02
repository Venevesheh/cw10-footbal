package repository.member;

import base.model.BaseEntity;
import base.repository.BaseRepository;
import base.repository.BaseRepositoryImpel;
import model.Member;
import service.member.MemberServiceImpel;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberRepositoryImpel extends BaseRepositoryImpel<Integer, Member> implements MemberRepository{

    public MemberRepositoryImpel(Connection connection) {
        super(connection);
    }

    @Override
    public ResultSet maxCoachSalary() {
        String sql = "select m.role,m.name,c.salary from member m,contract c\n" +
                "where m.id=c.member_id  and c.salary=(select max(salary ) from contract c\n" +
                "    join member m2 on m2.id = c.member_id where m2.role = 'coach')  ;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String getTableName() {
        return "member";
    }

    @Override
    public String getColumnName() {
        return "(name,role,team_id)";
    }

    @Override
    public String getCountOfQMarks() {
        return "(?,?,?)";
    }

    @Override
    public void fillPAramForPS(PreparedStatement preparedStatement, Member entity, Boolean isCountOnly) {
        try {
            preparedStatement.setString(1, entity.getName());
            preparedStatement.setString(2,entity.getRole());
            preparedStatement.setInt(3,entity.getTeamId());
        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Member mapResultsetToEntity(ResultSet resultSet) {
        Member member=new Member();
        try {
            member.setId(resultSet.getInt("id"));
            member.setName(resultSet.getString("name"));
            member.setRole(resultSet.getString("role"));
            member.setTeamId(resultSet.getInt("team_id"));
        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
        return member;

    }
}
