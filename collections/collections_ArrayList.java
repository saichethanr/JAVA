package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collections_ArrayList {
    public static void main(String[] args) {
        Collection <Integer> nums  = new ArrayList <Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(7);
        System.out.println(nums);


        List <Integer> num = new ArrayList <Integer>();
        nums.add(6);
        nums.add(2);
        nums.add(7);
        System.out.println(num.get(1));
    }
}
