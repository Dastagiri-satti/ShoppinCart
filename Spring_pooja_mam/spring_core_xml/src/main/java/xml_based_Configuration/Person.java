package xml_based_Configuration;

public class Person 
{
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void display()
	{
		System.out.println(name+" "+age);
	}

}
