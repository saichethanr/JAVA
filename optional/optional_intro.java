package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;

public class optional_intro {
    public static void main(String[] args) {
        List<String>list = new ArrayList<String>();
        list.add("anvin");
        list.add("lakshmi");
        list.add("kiran");

        //find first is not gibvinng string but giving an optional string 
        //optilanal class came intio existance to endf the error null point exeption
        //use optional to avoid null pointer exeption 
        Optional <String> name = list.stream().filter(str->str.contains("an")).findAny();
                            //or
        String name1 = list.stream().filter(str->str.contains("an")).findAny().orElse("not found");
        
        System.out.println(name.get());
        System.out.println(name.orElse("not found"));
    }
}
