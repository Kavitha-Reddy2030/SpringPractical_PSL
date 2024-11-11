package com.psl.training;

public class ContractEmployee1 implements Employee3 {
	private int id;
	private String name;
	private Address1 address;   //reference type property
	//Here our ContractEmployee class have address which has some other associated attributes 
	//Employee-------Address
	//dependent------Dependency
	//Injecting address class object into contract dynamically at runtime is called DEPENDENCY INJECTION
	
	//setter-getter Injection that's why in config.xml we provided bean of constructor arg
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
		System.out.println("Contract Employee Information");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println(address);
	}

}
