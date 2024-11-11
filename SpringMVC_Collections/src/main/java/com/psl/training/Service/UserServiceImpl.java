package com.psl.training.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.psl.training.DAO.UserDAO;
import com.psl.training.Entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;

	@Override
	public List<User> getUsers() {
// TODO Auto-generated method stub
		return dao.ReadAll();
	}

	@Override
	public User findOne(Long id) {
// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public User createUser() {
// TODO Auto-generated method stub
		return dao.create();
	}
}