package com.psl.training;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
//It is Inversion of control Demo(IOC)-for creating a bean and managing the bean
//In spring Bean refers to an object in java
	//Spring core feature-IOC
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee1 emp1=context.getBean("con_emp", Employee1.class);
		Employee1 emp2=context.getBean("reg_emp", Employee1.class);
		emp1.getempInfo();
		emp2.getempInfo();
		//This app is manageable where we can provide and change the content dynamically
		//It change the bean at runtime
	}

}
