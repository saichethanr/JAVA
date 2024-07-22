package collections;

import java.util.HashMap;
import java.util.Map;

public class collections_map {
    public static void main(String[] args) {
        Map <String,Integer> students = new HashMap<>();
        students.put("sai", 49);
        students.put("virat", 67);
        students.put("kiran", 99);

        System.out.println(students);
        System.out.println(students.get("sai"));

        //keys are set
        students.put("sai", 90);

        //to get all the keys
        System.out.println(students.keySet());
        for(String name : students.keySet() ){
            System.out.println(name + " : " +  students.get(name));
        }


        //hash table and hash map works in the same way but its for synchronized
    }
}
