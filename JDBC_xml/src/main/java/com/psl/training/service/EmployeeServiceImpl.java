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

	public void creatEmp(Employee emp) {// insert query service
		dao.create(emp);

	}

	public void updatemp(Employee emp) {
		dao.update(emp);

	}

	public void deleteemp(Employee emp) {
		dao.delete(emp);

	}

	public void selectempbyid(int id) {
		dao.select(id);

	}

	public List<Employee> fetchallEmployee() {
		return dao.readall();
	}

}
