package com.psl.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;



@Component("contractEmployee")  //specifies I want bean of contract employee class
@ComponentScan(basePackages = "com.psl.training")
public class ContractEmployee implements Employee {
	
	@Value("553")
	private int id;
	
	@Value("Kavitha")
	private String name;
	
	@Autowired
	@Qualifier("permanentAddress")  //specifies to spring container a particular class among multiple implementations of an interface
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
