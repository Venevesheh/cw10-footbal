package service.city;

import base.model.BaseEntity;
import base.service.BaseService;
import base.service.BaseServiceImpel;
import model.City;
import repository.city.CityRepository;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityServiceImpl extends BaseServiceImpel<Integer, City, CityRepository> implements CityService {

    public CityServiceImpl(CityRepository repository) {
        super(repository);
    }

    @Override
    public void CountOfTeamsInCit() {
        try {
            ResultSet resultSet = repository.CountOfTeamsInCity();
            while (resultSet.next())
            {
                System.out.print(resultSet.getString("name"));
                System.out.println(" | count of teams: "+ resultSet.getInt("count"));
            }
        }catch (SQLException e) {
            System.out.println("This is Service "+e.getMessage() );
        }
   }
}