package com.psl.training;

public class CurrentAddress implements Address1 {
	
	private int cityname;
	private int pincode;
	
	
	public int getCityname() {
		return cityname;
	}


	public void setCityname(int cityname) {
		this.cityname = cityname;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public void getaddress() {
		System.out.println("Current Address");

	}

}
