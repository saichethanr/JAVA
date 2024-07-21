package annotations;
//method overriding has to be done


//it simply means u can use it but dont use it
@Deprecated
class A{
   public void showCurrentDateAsPerTheDateFormat(){
      System.out.println("in a show");
   }
}

class B extends A{

   //we have to show the inention to the compiler about the over riding
   //by showing the inttetntion to the compiler the compiler recognize wht u are trying to do 
   @Override
   public void showCurrentDateAsPerTheDateFormat(){
      System.out.println("in b show");
   }
}
public class annotation_intro {
    public static void main(String[] args) {
        B obj = new B();
        obj.showCurrentDateAsPerTheDateFormat();
    }
}
