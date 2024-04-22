package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class B_P_Driver 
{
	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfigure.class);
		
	Bus b=(Bus)ac.getBean("bus");
	b.busInfo();
	b.p.display();
	

	}


}
