package lambdaexpression;



//functional interface as ther eis only signle method
//use of annotatiion can be usefull
@FunctionalInterface
 interface A {
  void show(int n);
    
}

// class B  implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }
public class lambda_intro {
    public static void main(String[] args) {
        //this is lambda expression
        A obj = (int n) ->{
                System.out.println("in show");
                System.out.println("this is for multiline statements" + " " + n);
        };
        //sigle line statements
        A obj1 = (int n) ->  System.out.println("in show");
        
        // no need to mentioon the type all the time
        A obj2 = (n) ->  System.out.println("in show");
        
        //for a single parameter no need to have a curly brackets
        A obj3 = n ->  System.out.println("in show");
    
        obj.show(6);
        obj1.show(7);
    }
}
