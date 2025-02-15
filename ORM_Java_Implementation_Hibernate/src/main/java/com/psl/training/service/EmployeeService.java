package com.psl.training.service;

import java.util.List;

import com.psl.training.entity.Employee;

public interface EmployeeService {

	public boolean insertEmployee(Employee emp);
	public Employee getEmployeeById(int Id);
	public List<Employee> getAllEmployees();
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(int id);
}
