package exeptions;

class NavinException extends Exception
{
	public NavinException(String string)
	{   
        //as the super class has the constructor which handles the exeption class
		super(string);
	}
}

public class exeption_custom {
    public static void main(String[] args) {
        //    	int i=2;
//   	int i=0;
    	int i=20;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
//    			throw new Exception("I don't want to do print zero");
    			throw new NavinException("I don't want to do print zero");
    	}

    	catch(ArithmeticException e)
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}
