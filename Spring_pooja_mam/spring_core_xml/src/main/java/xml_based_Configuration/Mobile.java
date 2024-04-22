package xml_based_Configuration;

public class Mobile 
{
	 String brand;
	 double price;
	 Sim s;
	 	
	 public Mobile(String brand, double price, Sim s) {
		this.brand = brand;
		this.price = price;
		this.s = s;
		
		System.out.println("constructor callled");
	}

	

}
	