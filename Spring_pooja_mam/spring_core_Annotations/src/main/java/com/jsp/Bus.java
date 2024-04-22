package com.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus 
{
	@Autowired
	Passenger p;
	
	public void busInfo()
	{
		System.out.println("bus has arrived");
	}

}
