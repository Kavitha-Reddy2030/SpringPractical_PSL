package com.psl.training;

public class ContractEmployee implements Employee2 {
	private int id;
	private String name;
	private Address address;   //reference type property
	//Here our ContractEmployee class have address which has some other associated attributes 
	//Employee-------Address
	//dependent------Dependency
	//Injecting address class object into contract dynamically at runtime is called DEPENDENCY INJECTION
	
	//constructor Injection that's why in config.xml we provided bean of constructor arg
	public ContractEmployee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void getempInfo() {
		System.out.println("Contract Employee Information");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println(address);
	}
}
