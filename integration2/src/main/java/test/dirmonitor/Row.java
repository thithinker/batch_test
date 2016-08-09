package test.dirmonitor;

import org.springframework.core.style.ToStringCreator;

public class Row {
	//<row><ID>1</ID><Name>Kabul</Name><CountryCode>AFG</CountryCode>
	//<District>Kabol</District><Population>1780000</Population></row>
	private int ID;
	private String Name;
	private String CountryCode;
	private String District;
	private String Population;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getPopulation() {
		return Population;
	}
	public void setPopulation(String population) {
		Population = population;
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this).append("id", ID).append("Name", Name).append("CountryCode", CountryCode).append("District", District).append("Population", Population).toString();
	}
}
