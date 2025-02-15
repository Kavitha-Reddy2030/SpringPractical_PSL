package com.psl.training;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.training.config.BeanConfig;
import com.psl.training.entity.Employee;
import com.psl.training.service.EmployeeService;

public class Main {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee emp = context.getBean("emp",Employee.class);
		
		emp.setEmpid(553);
		emp.setEmpname("Kavitha");
		emp.setCity("Ongole");
		
		emp.setEmpid(556);
		emp.setEmpname("Greeshma");
		emp.setCity("Tenali");
		
		//emp.setEmpid(557);
		//emp.setEmpname("Vani");
		//emp.setCity("Bhimavaram");
		

		EmployeeService service = context.getBean(EmployeeService.class);
		service.creatEmp(emp);
		//service.updatemp(emp);
		//service.deleteemp(emp);
		//service.selectempbyid(553);
		//System.out.println(service.fetchallEmployee());
		//or traverse through below enhanced loop
		List<Employee> list = service.fetchallEmployee();
		for (Employee e : list) {
			System.out.println(e);
		}

	}
}
