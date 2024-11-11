package com.psl.training.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//Model or entity class
@Entity
@Table(name="emp1")
public class Employee {
	@Id
	private int empid;
//	If we want to change the column name in the database table and field name, then we can @column annotation
//	@column(name="name")
//	private String empname;
	private String empname;
	private String city;
	private Date joindate;
	
	public Employee() {
		
	}

	public Employee(int empid, String empname, String city, Date joindate) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.city = city;
		this.joindate = joindate;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", city=" + city + ", joindate=" + joindate + "]";
	}

}
