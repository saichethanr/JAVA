package oops;

public class encapsulation {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}


class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	

	//getters and setters has to be used to return the private instance variables
	public int getAge()
	{
		return age;
	}
	public void SetAge(int a)
	{
		this.age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		this.name=n;
	}
}

