package com.psl.training.test;
import com.psl.training.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		ProductService service=context.getBean("productService",ProductService.class);
		System.out.println(service.multiply(20,30));
		System.out.println(service.add(100, 200,500));
	}

}
