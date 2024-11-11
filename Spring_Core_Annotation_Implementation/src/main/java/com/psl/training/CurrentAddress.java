package com.psl.training;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("currentAddress")  
@ComponentScan(basePackages = "com.psl.training")
public class CurrentAddress implements Address {
	private int pincode;
	private String cityname;
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
		return "CurrentAddress [pincode=" + pincode + ", cityname=" + cityname + ", streetname=" + streetname + "]";
	}
	

}
