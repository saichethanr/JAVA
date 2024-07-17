package oops.inheritannce;

//every class in java extenda the object class
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	public B(int n)
	{
		this();  //call constructor of same class
		System.out.println("in B int");
	}
}

public class thismethod {
    //		B obj=new B();
		B obj=new B(5);
}
