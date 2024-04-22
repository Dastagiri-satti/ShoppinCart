package com.jsp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Child1 implements Interface_Demo
{

	@Override
	public void test() 
	{
		System.out.println("From child class 1");
		
	}
	
	

}
