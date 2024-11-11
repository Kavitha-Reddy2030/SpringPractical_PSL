package com.psl.training;

public class Main {

	public static void main(String[] args) {
		
		Employee con_emp=new ContractEmployee();
		con_emp.getempInfo();
		
		Employee reg_emp=new RegularEmployee();
		reg_emp.getempInfo();
		
		//This program is not manageable and not configured
		//Solution is to use Spring Container-which is spring component

	}

}
