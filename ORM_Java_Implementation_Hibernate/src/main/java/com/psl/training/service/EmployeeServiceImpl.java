package com.psl.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.training.dao.EmployeeDAO;
import com.psl.training.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDAO dao;

	public boolean insertEmployee(Employee emp) {
		
		return dao.insertEmployee(emp);
	}

	public Employee getEmployeeById(int id) {
		
		return dao.getEmployeeById(id);
	}

	public List<Employee> getAllEmployees() {
		
		return dao.getAllEmployees();
	}

	public boolean updateEmployee(Employee emp) {
		
		return false;
	}

	public boolean deleteEmployee(int id) {
		
		return false;
	}

	

}
