package com.psl.training;

public class RegularEmployee1 implements Employee3 {
	private int id;
	private String name;
	private Address1 address; // reference type property

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

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	public void getempInfo() {
		System.out.println("Regular Employee Information");
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println(address);
	}
}
