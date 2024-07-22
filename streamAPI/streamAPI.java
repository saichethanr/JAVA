package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {
  
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4,5,7,8);

        Stream <Integer> s1 = lst.stream();
        //using stream we can perform any operations and its not going to effect the array
        //once after using the stream it cannot be reused just like the water in the river
        s1.forEach(n->System.out.println(n));
        //here s1 is a strean with has already been used
        //benifit is it provides a l0t of methods to work with

        Stream <Integer> s2 = s1.filter(n->n%2==0);;
        //s2 is a new stream
        


        Stream <Integer> s3 = s2.map(n->n*2);
        //s2 is a new stream
        s1.filter(n->n%2==0);
         
        //it wont give us a new stream
        //it will give us a single value
        s3.reduce(0,(c,e)->c+e);


        //single line stream usage
        int result=lst.stream().filter(n-> n%2==0)
        .map(n->n*2)
        .reduce(0, (c,e)-> c+e);
    }
}
