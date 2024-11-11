package com.psl.training.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.training.DAO.UserDAO;
import com.psl.training.Entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO dao;
	
	public boolean save(User user) {
	//business logic
	return dao.create(user);
	}
	public List<User> getUsers() {
	return dao.readAll();
	}
	public void deleteEmployee(int id) {
	dao.deleteEmployee(id);
	}
	@Override
	public void updateEmployee(User user) {
		// TODO Auto-generated method stub
		
	}
	



}
