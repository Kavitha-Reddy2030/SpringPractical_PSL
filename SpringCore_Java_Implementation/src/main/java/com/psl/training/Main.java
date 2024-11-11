package com.psl.training;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
//It is Inversion of control Demo(IOC)-for creating a bean and managing the bean
//In spring Bean refers to an object in java
	//Spring core feature-IOC
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Employee emp1=context.getBean("contractEmployee", Employee.class);
		
		emp1.getempInfo();
	}

}
