package collections.problems;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(5);
        hs.add(2);

        System.out.println(hs);
    }
}
