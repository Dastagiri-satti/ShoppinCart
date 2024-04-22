package xml_based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver 
{
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("configure.xml");
		Student s=(Student)ac.getBean("myStudent");
		s.display();
	}

}

