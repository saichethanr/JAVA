package oops;


class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
    //default constructor
    public Human(){
        System.out.println("in constructor");
    }

    //parametierized constructor
    public Human(int a,Human obj){
        age=a;
        this.name =obj.name;  
    }


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

//if we dont even mention the constructor java will create the default constructor

public class constructors {
    public static void main(String[] args) {
        Human obj = new Human();
    }
}
