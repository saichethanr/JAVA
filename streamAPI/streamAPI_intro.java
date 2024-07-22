package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamAPI_intro {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4,5,7,8);



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
        lst.forEach(n->System.out.println(n));

    }
}
