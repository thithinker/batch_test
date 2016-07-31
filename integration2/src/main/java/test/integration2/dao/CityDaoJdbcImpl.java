package test.integration2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import test.integration2.bean.City;

public class CityDaoJdbcImpl extends JdbcDaoSupport implements CityDao{
//	private static final String SELECT_ALL = "SELECT * FROM CITY";
	private static final String INSERT = "INSERT INTO CITY(id, name, countryCode, district, population) values(?,?,?,?,?)";
	
	private String selectAll;
	
	
	
	public void setSELECT_ALL(String selectAll) {
		this.selectAll = selectAll;
	}

	public List<City> getAllCities() {
		return this.getJdbcTemplate().query(selectAll, new RowMapper<City>(){
			public City mapRow(ResultSet rs, int arg1) throws SQLException {
				City city = new City();
				city.setId(rs.getInt("id"));
				city.setDistrict(rs.getString("name"));
				city.setDistrict(rs.getString("countryCode"));
				city.setDistrict(rs.getString("district"));
				city.setPopulation(rs.getInt("population"));
				
				return city;
			}
		});
	}

	public boolean insertACity(City city) {
		int addNumber = this.getJdbcTemplate().update(INSERT, city.getId(), city.getName(), city.getCountryCode(), city.getDistrict(), city.getPopulation());
		return addNumber == 1 ? true : false;
	}
	
	public boolean insertACity(Collection<City> cities) {
		boolean result = true;
		for(City city : cities){
			result &= insertACity(city);
		}
		return result;
	}

	public boolean updateACity(City city) {
		return false;
	}

	public boolean deleteACity(City city) {
		return false;
	}

}
