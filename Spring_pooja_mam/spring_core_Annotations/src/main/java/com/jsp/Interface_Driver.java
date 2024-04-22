package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Interface_Driver 
{
	
	public static void main(String[] args) 
	{
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(DemoConfigure.class);
		
		InterfaceTest id=(InterfaceTest)ac.getBean("interfaceTest");
		id.demo.test();
		
		
	}

}
