package com.psl.training;

public class RegularEmployee implements Employee2{
	private int id;
	private String name;
	private Address address;   //reference type property
	
	public RegularEmployee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void getempInfo() {
		System.out.println("Regular Employee Information");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println(address);
	}
}
