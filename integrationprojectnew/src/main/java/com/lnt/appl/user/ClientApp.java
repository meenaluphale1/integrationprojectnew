package com.lnt.appl.user;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lnt.appl.beans.Employee;
import com.lnt.appl.services.EmpServices;

public class ClientApp {

	public static void main(String[] args) {
		/*
		 * 1. While creating the context, it will create Dao bean first.
		 * 2. It will create service bean and will do DI of dao bean inside it.
		 * 3. Context is ready.
		 */
		ApplicationContext ctx =new ClassPathXmlApplicationContext("springConfig.xml");
		
		//EmpService empService = new EmpSerivceImpl();
		
		EmpServices services = ctx.getBean("empService", EmpServices.class);	
		
		for(Employee emp : services.getEmpList()){
			System.out.println(emp);
		}
		
		
	/*	Employee emp = services.getEmpById(7902);
	        System.out.println("Found :  = " + emp);*/
		
		
		
		
		//ctx.close(); 
		
		/*
		try {
			
			 * 1. Call of Service method will take control to method in Service class.
			 * 2. Service class method does a call to method in Dao class.
			 * 3. Control goes to method in Dao class.
			
			List<Employee> userList = services.getEmpList();
			
			System.out.println(userList);
		} catch (HrExceptions e) {
			e.printStackTrace();
		}*/
		
		/*Employee emp= new Employee(101,"Jay",5000);

			try {
				services.insertNewEmployee(emp);
			} catch (HrExceptions e) {
			
				e.printStackTrace();
			}*/
		
		
		
	}
}
