package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class streamAPI_parallelstream {
    public static void main(String[] args) {
        //to see the effect the prarallel stream can create we have to have huge amount of data
        //all zeros of 10000 size
        List <Integer> nums = new ArrayList<>(10000);

        Random rand = new Random();
        for(int i=0;i<10000;i++){
            int num =rand.nextInt(1000);
            nums.add(num);
        }

        System.out.println(nums);

        //find the sum
        //using the reduce method
        int sum = nums.stream().map(n->n*2).reduce(0, (c,e)->c+e);
        System.out.println(sum);
        

        //using the map to int method
        long seqstart = System.currentTimeMillis();
        int sum2 = nums.stream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println(sum2);
        long seqend = System.currentTimeMillis();
        

        System.out.println();


        
        //using paralelle stream
        long seqstart2 = System.currentTimeMillis();
        int sum3 = nums.parallelStream().map(n->n*2).mapToInt(n->n).sum();
        System.out.println(sum2);
        long seqend2= System.currentTimeMillis();

    }
}
