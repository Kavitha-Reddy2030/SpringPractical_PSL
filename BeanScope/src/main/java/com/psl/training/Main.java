package com.psl.training;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
//It is Inversion of control Demo(IOC)-for creating a bean and managing the bean
//In spring Bean refers to an object in java
	//Spring core feature-IOC
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee emp1=context.getBean("con_emp", Employee.class);
		System.out.println(emp1.hashCode());
		Employee emp2=context.getBean("con_emp", Employee.class);
		System.out.println(emp2.hashCode());
		//Spring create only singleton object even we have declared 2 objects using getbean
		//By defalut every bean has singleton scope
		//Employee emp3=context.getBean("reg_emp", Employee.class);
		//Only single object stored on to memory
		//Solution is we need to provide scope externally what we want in config.xml
		//Then it provides different hash codes or 2 beans will be created
		
		emp1.getempInfo();
		//emp2.getempInfo();
		
	}

}
