package com.psl.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ContractEmployee implements Employee {
	
	private int id;
	private String name;
	
	@Autowired          //autowired can be specified with field or setter method of dependency
	@Qualifier("add")  //specifies to spring container a particular class among multiple implementations of an interface
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
		return "ContractEmployee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}



	
	
}
