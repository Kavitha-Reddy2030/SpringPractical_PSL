package com.psl.training.dao;

import java.util.List;

import com.psl.training.entity.Employee;

public interface EmployeeDAO {
	public boolean insertEmployee(Employee emp);
	public Employee getEmployeeById(int id);
	public List<Employee> getAllEmployees();
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(int id);
}
