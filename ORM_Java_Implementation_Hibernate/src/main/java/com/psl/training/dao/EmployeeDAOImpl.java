package com.psl.training.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.psl.training.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public EmployeeDAOImpl() {
		
	}

	public boolean insertEmployee(Employee emp) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		return true;
	}

	public Employee getEmployeeById(int id) {
		//hibernate use session for performing db operations
		Session session=sessionFactory.openSession();
		return session.get(Employee.class,id);
	}

	public List<Employee> getAllEmployees() {
		Session session=sessionFactory.openSession();
		return session.createQuery("from Employee database",Employee.class).list();
	}

	public boolean updateEmployee(Employee emp) {
		try {
			Session session=sessionFactory.openSession();
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			//return true;
		}catch(Exception e) {
			System.out.println(e);
		}
		return true;
	}

	public boolean deleteEmployee(int id) {
		Session session=sessionFactory.openSession();
		Employee e= session.get(Employee.class,id);
		if(e==null) {
			throw new RuntimeException("Resource not found");
		}
		session.delete(e);
		return true;
	}

	
}
