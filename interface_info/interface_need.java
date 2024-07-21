package interface_info;

//use of an abstract class or an interface would work
abstract class  computer {
    public abstract void code(computer comp);
}
class Laptop extends computer
{
  public void code(computer comp){
    System.out.println("code in lap");
  }
}

class desktop extends  computer
{
  public void code(computer comp){
    System.out.println("code in lap");
  }
}

public class interface_need {
    public static void main(String[] args) {
        computer obj1 = new Laptop();
        computer obj2 = new desktop();

        obj1.code(obj1);
        obj2.code(obj1);
    }
}
