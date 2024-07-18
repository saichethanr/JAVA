package oops;

class A
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}


public class inner {
    public static void main(String[] args) {
        A obj=new A();
    	obj.show();
    	
        //normal implementation
        // A.B obj2=obj.new B();
        // obj2.config();
    	
        //only when the class is static
    	A.B obj1=new A.B();
    	obj1.config();
    }
}
