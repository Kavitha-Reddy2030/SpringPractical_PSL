package com.psl.training;

import org.springframework.beans.factory.annotation.Autowired;

public class ContractEmployee implements Employee {
	private int id;
	// private String name;

	@Autowired // To link this contract employee class with address object
	private Address address; // reference type property

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void getempInfo() {
		System.out.println("Contract Employee Information");
		System.out.println(this.getId());
	}
}
