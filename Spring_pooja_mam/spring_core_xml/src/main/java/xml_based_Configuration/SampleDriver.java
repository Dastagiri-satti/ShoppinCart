package xml_based_Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext  context=new ClassPathXmlApplicationContext("configure.xml");
	
		Sample s=	context.getBean("mySample",Sample.class);
		s.test();
		
	}

}
