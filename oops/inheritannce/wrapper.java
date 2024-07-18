package oops.inheritannce;

public class wrapper {
    public static void main(String[] args) {
        int num=10;
        //deprecated
        Integer num1 = new Integer(8);//storing a primitive value in the object is called boxing
        Integer n = 8;  // auto boxing (as it happens automatically)
        System.out.println(num1);
        int res = num1.intValue(); //unboxing (geting the integer value from the object)
        int r = num1; //auto unboxing
        String str = "12";
        int num3 = Integer.parseInt(str);
    }
}
