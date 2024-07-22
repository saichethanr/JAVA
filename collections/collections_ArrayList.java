package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collections_ArrayList {
    public static void main(String[] args) {
        //collection does not use indexing
        Collection <Integer> nums  = new ArrayList <Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(7);
        System.out.println(nums);

        //list uses indesx to work with 
        List <Integer> num = new ArrayList <Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(7);
        System.out.println(num.get(1));
        System.out.println(num.indexOf(2));

    }
}
