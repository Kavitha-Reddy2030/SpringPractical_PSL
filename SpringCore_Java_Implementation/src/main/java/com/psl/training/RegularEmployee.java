package com.psl.training;

import org.springframework.beans.factory.annotation.Autowired;

public class RegularEmployee implements Employee{
	//private int id;
	//private String name;
	
	@Autowired
	private Address address;   //reference type property
	
	public void getempInfo() {
		System.out.println("Regular Employee Information");
	}
}
