package com.psl.training;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Hospital obj1=context.getBean("hospital", Hospital.class);
		System.out.println(obj1);
	}

}
