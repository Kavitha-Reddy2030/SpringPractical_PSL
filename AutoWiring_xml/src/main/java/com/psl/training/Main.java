package com.psl.training;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp1=context.getBean("emp",Employee.class);
		System.out.println(emp1);
	}

}
