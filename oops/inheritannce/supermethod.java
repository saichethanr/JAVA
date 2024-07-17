package oops.inheritannce;


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
//		super();
		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
		super(n);
		System.out.println("in B int");
	}
}


public class supermethod{
    public static void main(String args[]){
        //when we create a object of the subclass the constructor of the usper calss is called first and the constructor of the 
        //subclass is called next

        //notte 
        //every constructor has a method in it even if we dont mension it its super();
        B obj=new B();
        //		B obj=new B(5);
    }
}
