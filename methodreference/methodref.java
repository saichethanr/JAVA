package methodreference;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class methodref {
    public static void main(String[] args) {
        List <String> names = Arrays.asList("navin","harsh","john");

        //general method
        // List <String> unames  = names.stream().map(name -> name.toUpperCase()).toList();

        //method reference
        // List <String> unames1  = names.stream().map(String::toUpperCase).toList();
        

        // unames.forEach(System.out::println);

    }
}
