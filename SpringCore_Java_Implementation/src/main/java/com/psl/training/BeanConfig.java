package com.psl.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //To tell spring container this is the class which provide configuration for my application
@ComponentScan(basePackages = "com.psl.training")
public class BeanConfig {
	
	@Bean("contractEmployee") //to tell here is the object of contract employee class
	 public Employee getcontractEmployee() {
		ContractEmployee  employee=new ContractEmployee();
		 employee.setId(553);
		 return employee;
	 }
	
	@Bean("address")
	public Address getAddress() {
		Address address = new Address();
		return address;
	}
	 
}
