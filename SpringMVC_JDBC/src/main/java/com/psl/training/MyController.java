package com.psl.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.psl.training.model.Employee;
import com.psl.training.service.EmployeeService;

@Controller
public class MyController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping("registration")
	public ModelAndView gethomePage() {
		ModelAndView model= new ModelAndView();
		model.setViewName("empregistration");
		return model;
	}
	
	@RequestMapping(value = "registerEmp", method = RequestMethod.POST)
	public String registerEmp(@ModelAttribute("emp") Employee emp) {
	service.createEmp(emp);
	return "message";
	}
	
	@RequestMapping("getEmps")
	public String getEmp(ModelMap model) {
	List<Employee> emps = service.readEmp();// select
	model.addAttribute("emps", emps);
	return "displayEmps";
	}
}
