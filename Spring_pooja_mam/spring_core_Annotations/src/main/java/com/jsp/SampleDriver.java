package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleDriver
{
	public static void main(String[] args)
	{

		ApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfigure.class);
		
		Sample s=(Sample)ac.getBean("sample");
		System.out.println(s);
		
		Sample s1=(Sample)ac.getBean("sample");
		System.out.println(s1);
	

	}

}
