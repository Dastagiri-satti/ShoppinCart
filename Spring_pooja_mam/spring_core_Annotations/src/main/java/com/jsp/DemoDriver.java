package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoDriver {

	public static void main(String[] args) {
		
	ApplicationContext ac=new AnnotationConfigApplicationContext(DemoConfigure.class);
	Demo d=(Demo)ac.getBean("demo");
	d.m1();

	}

}
