package com.psl.training.DAO;

import java.util.List;
import com.psl.training.Entity.User;

public interface UserDAO {
	public List<User> ReadAll();// Read all users from collection

	public User findOne(Long id);// find particular user from collection

	public User create();// insert data into collection
}