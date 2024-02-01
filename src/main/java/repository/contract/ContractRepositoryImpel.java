package repository.contract;

import base.repository.BaseRepositoryImpel;
import model.Contract;

import java.sql.*;

public class ContractRepositoryImpel extends BaseRepositoryImpel<Integer, Contract> implements ContractRepository {

    public ContractRepositoryImpel(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return "cotract";
    }

    @Override
    public String getColumnName() {
        return "(member_id,start_date,end_date,salary)";
    }

    @Override
    public String getCountOfQMarks() {
        return "(?,?,?,?)";
    }

    @Override
    public void fillPAramForPS(PreparedStatement preparedStatement, Contract entity, Boolean isCountOnly) {
        try {
            preparedStatement.setInt(1,entity.getMemberId());
            preparedStatement.setDate(2, (Date) entity.getStartDate());
            preparedStatement.setDate(3, (Date) entity.getEndDate());
            preparedStatement.setInt(4,entity.getSalary());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Contract mapResultsetToEntity(ResultSet resultSet) {
        Contract contract = new Contract();
        try {
            contract.setId(resultSet.getInt("id"));
            contract.setMemberId(resultSet.getInt("member_id"));
            contract.setStartDate(resultSet.getDate("start_date"));
            contract.setEndDate(resultSet.getDate("end_date"));
            contract.setSalary(resultSet.getInt("salary"));
        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
        return contract;
    }
}
