package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class streamAPI_foreach {
  
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4,5,7,8);

        //lst.forEach(n->System.out.println(n));
        

        //consumer interface  is a functional interface hence use lamba expression
        Consumer<Integer> con = new Consumer<Integer>() {
            public void accept(Integer n){
                System.out.println(n);
            }
        };


        lst.forEach(con);




      



        //filter the odd numbers from the list and double the even numbers
        // int sum=0;
        // for(Integer n:lst){
        //     if(n%2==0){
        //         n*=2;
        //         sum+=n;
        //     }
        // }
        // System.out.println(lst);
         


        //normal for loop
        //enhanced for loop
        //for each for loop

    }
}
