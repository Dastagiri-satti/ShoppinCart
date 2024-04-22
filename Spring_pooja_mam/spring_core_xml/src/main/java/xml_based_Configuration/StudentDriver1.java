package xml_based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver1 
{
	
	
	public static void main(String[] args) {
		
		ApplicationContext a1=new ClassPathXmlApplicationContext("configure.xml");
		System.out.println("object is created"+a1);
		
		Student1 s1=(Student1) a1.getBean("s1");
		
		s1.display();
		
	}
	
	
	

}
