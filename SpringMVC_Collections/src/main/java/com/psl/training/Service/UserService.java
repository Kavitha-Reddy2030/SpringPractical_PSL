package com.psl.training.Service;

import java.util.List;
import com.psl.training.Entity.User;

public interface UserService {
	public List<User> getUsers();

	public User findOne(Long id);

	public User createUser();
}