package test.integration2.task;

import org.springframework.batch.item.ItemProcessor;

import test.integration2.bean.City;

public class ItemFileProessor implements ItemProcessor<City, City>{

	public City process(City city) throws Exception {
		City result = new City();
		
		result.setId(city.getId());
		result.setCountryCode(city.getCountryCode());
		result.setName("new_" + city.getName());
		result.setDistrict(city.getDistrict());
		result.setPopulation(city.getPopulation());
		if(city.getId() % 2 == 1){
			return result;
		}else{
			return null;
		}
	}
	

}
