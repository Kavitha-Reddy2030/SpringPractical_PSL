package com.psl.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RegularEmployee implements Employee{
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("add1")
	private Address address;   
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "RegularEmployee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
