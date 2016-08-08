package test.integration2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.RowMapper;

import test.integration2.bean.City;

public class CityRowMapper implements RowMapper<City>{
	private static final Log LOG = LogFactory.getLog(CityRowMapper.class);

	public City mapRow(ResultSet rs, int arg1) throws SQLException {
		City city = new City();
		
		city.setId(rs.getInt("id"));
		city.setName(rs.getString("name"));
		city.setCountryCode(rs.getString("countrycode"));
		city.setDistrict(rs.getString("district"));
		city.setPopulation(rs.getInt("population"));
		LOG.warn(city);
		return city;
	}

}
