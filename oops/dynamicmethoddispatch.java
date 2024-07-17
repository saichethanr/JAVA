package oops;

// class Computer
// {
//	
// }
// class Laptop extends Computer
// {
//	
// }

class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}

public class dynamicmethoddispatch {
    public static void main(String[] args) {
        //		A obj=new B();
        //		obj.show();
                


        // the behaviour depends on what object is created and not what type of the object
                A obj=new A();
                obj.show();
                
                obj=new B();
                obj.show();
                
                obj=new C();
                obj.show();
                
        //		obj=new D();
                
        //		Laptop obj1=new Laptop();
        //		Computer obj1=new Laptop();
            
            }
}
