package repository.city;

import base.repository.BaseRepositoryImpel;
import model.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityRepositoryImpl extends BaseRepositoryImpel<Integer,City> implements CityRepository{

    public CityRepositoryImpl(Connection connection) {
        super(connection);
    }

    @Override
    public String getTableName() {
        return null;
    }

    @Override
    public String getColumnName() {
        return null;
    }

    @Override
    public String getCountOfQMarks() {
        return null;
    }

    @Override
    public void fillPAramForPS(PreparedStatement preparedStatement, City entity, Boolean isCountOnly) {

    }

    @Override
    public City mapResultsetToEntity(ResultSet resultSet) {
        return null;
    }

    @Override
    public ResultSet CountOfTeamsInCity() {
        ResultSet resultSet = null;
        String string ="select city.name, count(t.id)\n" +
                "from city\n" +
                "         join team t on city.id = t.city_id\n" +
                "group by city.name" ;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(string);
            resultSet = preparedStatement.executeQuery();

        }catch (SQLException e)
        {
            System.out.println("This is repo "+e.getMessage());
        }
        return resultSet;
    }
}
