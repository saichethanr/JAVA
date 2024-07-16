package string;

public class intro {
    public static void main(String[] args) {
        String name = new String("sai");
        String s = "hello";
        System.out.println(s +  "sai");
        System.out.println(name.hashCode());
        System.out.println(name.charAt(2));
        name.concat(s);
    }
}
