package com.psl.training;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("permanentAddress")  
@ComponentScan(basePackages = "com.psl.training")
public class PermanentAddress implements Address {
	
	@Value("523303")
	private int pincode;
	
	@Value("Ongole")
	private String cityname;
	
	@Value("Islampet")
	private String streetname;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	@Override
	public String toString() {
		return "PermanentAddress [pincode=" + pincode + ", cityname=" + cityname + ", streetname=" + streetname + "]";
	}
	
}
