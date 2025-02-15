package com.psl.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.psl.training.Entity.User;
import com.psl.training.Service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("getUsers")
	public ModelAndView getUser(ModelMap model) {
	List<User> users = service.getUsers();
	model.addAttribute("users", users);
	ModelAndView m = new ModelAndView();
	m.setViewName("displayUsers");
	return m;
	}
	
	@RequestMapping("show/{id}")
	public String showusers(@PathVariable Long id, ModelMap model) {
	{
	User users = service.findOne(id);
	model.addAttribute("users", users);
	return "displayUsers";
	}
	}
	@RequestMapping("newUsers")
	public ModelAndView getnewUsers(ModelMap model) {
	User users = service.createUser();
	model.addAttribute("users", users);
	ModelAndView m = new ModelAndView();
	//m.setViewName("displayUsers"); //If we want to display newly added user data then use this
	m.setViewName("message"); //If we want just a message that user is added successfully or not
	return m;
	}
}