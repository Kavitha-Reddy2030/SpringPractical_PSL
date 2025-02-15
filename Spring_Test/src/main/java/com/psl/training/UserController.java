package com.psl.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
//@RequestMapping("registrationUser")
	@RequestMapping(value = "/registrationUser", method = RequestMethod.GET)
	public ModelAndView showRegistrationPage() {
		ModelAndView m = new ModelAndView();
		m.setViewName("UserReg");
		return m;
	}

//@PostMapping("registerUser")
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		service.save(user);// insert data
		model.addAttribute("result", "User inserted in to database table");
		return "UserReg";
	}

	@RequestMapping("getUsers")
	public String getUser(ModelMap model) {
		List<User> users = service.getUsers();// select
		model.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("delete")
	public String getUser(@RequestParam("id") int id) {
		service.deleteEmployee(id);
		return "message";
	}
}