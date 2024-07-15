package oops;

class calc{
    public  int add(int a,int b){
       return a+b;
    }
}
public class intro {
    public static void main(String args[]){
          calc c = new calc();
          int ans  =  c.add(1, 5);
          System.out.println(ans);
          
    }
}
