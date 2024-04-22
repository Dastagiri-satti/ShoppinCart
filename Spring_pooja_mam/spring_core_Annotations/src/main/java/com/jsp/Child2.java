package com.jsp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Child2 implements Interface_Demo
{

	@Override
	public void test() 
	{
		System.out.println("child class 2");
	}

}
