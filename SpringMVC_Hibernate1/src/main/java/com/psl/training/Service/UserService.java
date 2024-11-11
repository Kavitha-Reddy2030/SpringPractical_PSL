package com.psl.training.Service;

import java.util.List;

import com.psl.training.Entity.User;

public interface UserService {
	public boolean save(User user);// insert
	public List<User> getUsers();// select
	public void updateEmployee(User user);
	public void deleteEmployee(int id);
	

}
