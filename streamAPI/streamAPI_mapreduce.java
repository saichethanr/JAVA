package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamAPI_mapreduce {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(4,5,7,8);
        int result=lst.stream().filter(n-> n%2==0)
        .map(n->n*2)
        .reduce(0, (c,e)-> c+e);


        //how fiter works
        //filter uses predicate and predicate implements the test method just like a filter
        //predicate is a functional interface
        //so we can use the lamda expression
        Predicate <Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                  if(n%2==0){
                    return true;
                  }
                  else{
                    return false;
                  }
            }
            
        };


        //how map works?
        //map implements the Function interface
        //as function is a functional interface we can also use the lambda expression
        Function <Integer,Integer> fun = new Function<Integer,Integer>() {
            public Integer apply(Integer n){
                return n*2;
            }
        };



        //to get a sorted stream
        //reduce has to be eliminated as it return a single value
        //,sorted has to be applied
        Stream<Integer>st=lst.stream().filter(n-> n%2==0)
        .map(n->n*2).sorted();

        //to filter  it using the multiple threads -to fasten the process we need to use the parallel stream
        //here we need not use the parallel stream as we want to keep the elements together
    }
}
