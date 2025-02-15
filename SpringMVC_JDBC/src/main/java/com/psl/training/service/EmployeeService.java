package com.psl.training.service;

import java.util.List;

import com.psl.training.model.Employee;

public interface EmployeeService {
	void createEmp(Employee emp);// insert record

	void updateEmp(Employee emp);

	void deleteEmp(Employee emp);

	void selectEmpById(int id);// access single record

	List<Employee> readEmp();// Access all data
	List<Employee> readAll();
	

}
