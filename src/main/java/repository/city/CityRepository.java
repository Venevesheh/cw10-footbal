package repository.city;

import base.repository.BaseRepository;
import model.City;

import java.sql.ResultSet;

public interface CityRepository extends BaseRepository<Integer, City> {
    ResultSet CountOfTeamsInCity();

}
