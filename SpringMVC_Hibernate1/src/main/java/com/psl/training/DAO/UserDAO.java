package com.psl.training.DAO;

import java.util.List;

import com.psl.training.Entity.User;

public interface UserDAO {
	public boolean create(User user);//insert-- create
	public List<User> readAll();//select--read
	public boolean deleteEmployee(int id);
	public boolean updateEmployee(User user);
}
