package test.integration2.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityDaoJdbcImplTest {
	@Test
	public void testGetAllCities() {
		CityDaoJdbcImpl cityDaoJdbcImpl = new CityDaoJdbcImpl();
		
		System.out.println(cityDaoJdbcImpl.getAllCities().size());
		assertNotNull(cityDaoJdbcImpl.getAllCities());
	}
}
