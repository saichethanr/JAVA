package oops;


//once a class is declared final it cannot be inherited
class Calc
{
	public final void show()
	{
		System.out.println("By Navin");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc extends Calc
{
    //once a method is declared final it cannot be over ridden
	// public void show(){
	// 	System.out.println("By John");
	// }
}

//once a variable is declared final its value cannot be changed

public class finalkey {
    public static void main(String[] args) {
        //once a variable is made final it cannot be fourther be changed
 
        
            //    	final int num=8;
            //    	num=9;
            //    	System.out.println(num);
                    
            //    	Calc obj= new Calc();
            //    	obj.show();
            //    	obj.add(4, 5);
                    
                    AdvCalc obj= new AdvCalc();
                    obj.show();
                    obj.add(4, 5);
                }
    
}
