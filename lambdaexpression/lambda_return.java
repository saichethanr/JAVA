package lambdaexpression;


@FunctionalInterface
 interface A {
  int add(int i,int j);
    
}


public class lambda_return {
    public static void main(String[] args) {
        //this is lambda expression
        A obj = (int i,int j) ->{
           return i+j;
        };
        //sigle line statements
        //A obj1 = (int i,int j) ->  return i+j;  //for 1 statement no need to write return withoput return it becomes rerturn type
        A obj1 = (int i,int j) -> i+j; 
      
    

    }
}
