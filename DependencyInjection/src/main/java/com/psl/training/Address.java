package com.psl.training;

public class Address {
private int pincode;
private String cityname;
private String streetname;
public Address(int pincode, String cityname, String streetname) {
	super();
	this.pincode = pincode;
	this.cityname = cityname;
	this.streetname = streetname;
}
@Override
public String toString() {
	return "Address [pincode=" + pincode + ", cityname=" + cityname + ", streetname=" + streetname + "]";
}

}
