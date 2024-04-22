package xml_based_Configuration;

public class Student {

	private String name;
	private int age;
	private String Address;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public void display() {
		System.out.println(name + " " + age + " " + Address);
	}

}
