package com.psl.training.DAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.psl.training.Entity.User;

@Repository
public class UserDAOImpl implements UserDAO // Dao class or service class
{
	private static List<User> list = new LinkedList<User>();
	static {
		User p=new User(553L,"Kavitha");
		list.add(p); //Any of the way
		list.add(new User(556L, "Greeshma"));
		list.add(new User(551L, "Sonalika"));
		list.add(new User(555L, "Janani"));
		list.add(new User(554L, "Pranathi"));
	}

	@Override
	public List<User> ReadAll() {// Read opeartion
		return list;
	}

	public User findOne(Long id) {
		for (User user : list) {
			if (user.getUser_id().compareTo(id) == 0) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User create() {
		User u = new User(558L, "Meher");
		list.add(u);
		return u;
	}
}