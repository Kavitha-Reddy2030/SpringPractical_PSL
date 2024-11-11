package com.psl.training.service;

import java.util.List;

import com.psl.training.entity.Employee;

public interface EmployeeService {

	void creatEmp(Employee emp);

	void updatemp(Employee emp);

	void deleteemp(Employee emp);

	void selectempbyid(int id);

	List<Employee> fetchallEmployee();
}
