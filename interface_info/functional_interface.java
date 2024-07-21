package interface_info;


//functional interface as ther eis only signle method
//use of annotatiion can be usefull
@FunctionalInterface
 interface A {
  void show();
    
}

class B  implements A{
    public void show(){
        System.out.println("in show");
    }
}
public class functional_interface {
    public static void main(String[] args) {
        A obj = new B() ;
        obj.show();
    }
}
