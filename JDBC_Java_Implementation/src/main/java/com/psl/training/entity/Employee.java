package com.psl.training.entity;

import org.springframework.stereotype.Component;

//Model or entity class
@Component("emp")
public class Employee {
	private String empname;
	private int empid;
	private String city;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", city=" + city + "]";
	}

}
