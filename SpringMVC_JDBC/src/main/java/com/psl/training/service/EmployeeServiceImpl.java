package com.psl.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.training.dao.EmployeeDAO;
import com.psl.training.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO dao;

	@Override
	public void createEmp(Employee emp) {
		dao.create(emp);
		
	}

	@Override
	public void updateEmp(Employee e) {
		
		
	}

	@Override
	public void deleteEmp(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectEmpById(int id) {
		// TODO Auto-generated method stub
		
	}


	public List<Employee> readEmp(){
		return dao.readall();
	}

	@Override
	public List<Employee> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
