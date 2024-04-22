package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfigure.class);
		
		Student s=(Student)ac.getBean("student");
		System.out.println(s.name+" "+s.age);

	}

}
