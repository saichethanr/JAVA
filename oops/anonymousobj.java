package oops;


class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}
public class anonymousobj {
    public static void main(String a[]) 
	{
		int marks;
		marks=99;
		//we can resuse this type of object as it is not assigned
		new A();   //anonymous object
		new A().show();
		
//		A obj=new A();
		A obj;
		obj=new A();
		
		obj.show();
	}
}
