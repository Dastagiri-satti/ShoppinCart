package xml_based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Engine_Driver
{
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Car_Engine.xml");
		Car c=(Car)ac.getBean("myCar");
		
		System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		System.out.println(c.getE().getModelNo());
	}

}
