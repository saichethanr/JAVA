package string;

public class mute {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("sai");
        System.out.println(sb.capacity()); 
        System.out.println(sb.length());  
        sb.append("chethan");
        String s = sb.toString();
        sb.insert(0, "saichethan");
        sb.setLength(30);
        
    }
}
