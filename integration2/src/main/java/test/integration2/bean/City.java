package test.integration2.bean;

import org.springframework.core.style.ToStringCreator;

public class City {
	private Integer id;
	private String name;
	private String countryCode;
	private String district;
	private Integer population;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this).append("id", id).append("name", name).
				append("countryCode", countryCode).append("district", district).append("population", population).toString();
	}
	
}
