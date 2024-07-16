package quiz.q2;

//local variable has same name as instanece variable
class calc{
  int n1=5;
  void add(int n1){
    System.out.println(n1);
  }
    
}

public class q2 {
    public static void main(String[] args) {
        calc c =  new calc();
        c.add(18);
    }
}
