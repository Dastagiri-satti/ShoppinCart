package xml_based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sim_Mobile_Driver 
{
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Car_Engine.xml");
		
		Mobile m=(Mobile)ac.getBean("myMobile");
		
		System.out.println(m.brand+"---->"+m.price);
		System.out.println(m.s.type+"---->"+m.s.name);
	}

}
