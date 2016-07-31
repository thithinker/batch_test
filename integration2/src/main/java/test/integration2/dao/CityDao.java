package test.integration2.dao;

import java.util.List;

import test.integration2.bean.City;

public interface CityDao {
	List<City> getAllCities();
	boolean insertACity(City city);
	boolean updateACity(City city);
	boolean deleteACity(City city);
}
