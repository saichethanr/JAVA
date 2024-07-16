package static_keyword;
class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	

	// will be called first
	//every time a classs is loaded by the class loader the static block is runned
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class block {
	public static void main(String[] args) throws ClassNotFoundException
	{
		//to load the class
		Class.forName("Mobile");
		
//		Mobile obj1=new Mobile();
//		obj1.brand="Apple";
//		obj1.price=1500;
//		Mobile.name="SmartPhone";
//		
//		Mobile obj2=new Mobile();

	
	}
}