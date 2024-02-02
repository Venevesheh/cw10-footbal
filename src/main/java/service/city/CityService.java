package service.city;

import base.service.BaseService;
import model.City;

public interface CityService extends BaseService<Integer, City> {
    void CountOfTeamsInCit();
}
