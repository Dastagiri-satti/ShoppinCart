package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeDriver
{
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(DemoConfigure.class);
		
		Employee e=(Employee) ac.getBean("employee");
		System.out.println(e.getName()+"\n"+e.getSalary()+"\n"+e.getRole());
		
	}

}
