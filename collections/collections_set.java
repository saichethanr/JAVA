package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class collections_set {
       public static void main(String[] args) {
        //collection does not use indexing
        Collection <Integer> nums  = new ArrayList <Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(7);
        System.out.println(nums);

        //set dosent uses index to work with
        Set <Integer> num = new HashSet <Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(7);
        for(int n:num){
            System.out.println(n);
        }

        //for sorted values
        Set <Integer> num1 = new TreeSet <Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(7);
        for(int n:num1){
            System.out.println(n);
        }
        

        //use of itaerator to iterate
        Iterator <Integer> values = num1.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}
