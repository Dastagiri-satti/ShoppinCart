package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	
	String name;
	int age;
	
	public Student(@Value(value="mallu")String name,@Value(value="22")int age) 
	{
	
		this.name = name;
		this.age = age;
	}
	
	

}
