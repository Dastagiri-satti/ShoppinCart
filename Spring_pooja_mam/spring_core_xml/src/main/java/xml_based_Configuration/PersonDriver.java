package xml_based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver 
{
	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("configure.xml");
		
		Person p=(Person)ac.getBean("myperson");
		p.display();
	}

}
