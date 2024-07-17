package oops.inheritannce;

class Calc 
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
}
class AdvCalc extends Calc
{
    //subclass add will over ride the super class method
	public int add(int n1, int n2)
	{
		return n1+n2+1;
	}
}

public class methodoverriding {
    public static void main(String args[])
	{
//		B obj=new B();
//		obj.show();
//		obj.config();
		
		AdvCalc obj=new AdvCalc();
		int r1=obj.add(3, 4);
		System.out.println(r1);
	}
}
