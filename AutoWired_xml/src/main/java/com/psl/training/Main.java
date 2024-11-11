package com.psl.training;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
//It is Inversion of control Demo(IOC)-for creating a bean and managing the bean
//In spring Bean refers to an object in java
	//Spring core feature-IOC
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp1=context.getBean("emp",Employee.class);
		Employee emp2=context.getBean("reg_emp",Employee.class);
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
