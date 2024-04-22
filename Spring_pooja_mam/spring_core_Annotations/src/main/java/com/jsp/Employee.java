package com.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee
{
	private String name;
	private double salary;
	private String role;
	
	
	
	
	public String getName() {
		return name;
	}
	@Value(value="mala")
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	
	@Value(value="45000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	
	@Value(value="HR")
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
