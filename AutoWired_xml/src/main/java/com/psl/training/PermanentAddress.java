package com.psl.training;

public class PermanentAddress implements Address {
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
		return "PermanentAddress [pincode=" + pincode + ", cityname=" + cityname + ", streetname=" + streetname + "]";
	}
	
}
