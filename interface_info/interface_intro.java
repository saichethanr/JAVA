package interface_info;

//instead of creating an abstract class we can create a interface
//BY DEFAULT EVERY METHOD IN INTEFACE IS A PUBLIC ABSTRACT METHOD
//dont have their own memory in the heap
interface  A{
    int age =67;  //final and static by defaut
    int area=91;
    void show();
    void config();
        
}
// in the class that implements the interface that class should define all the methods 
// listed in the interface
class B implements A{
   public void show(){
     System.out.println("hello");
   }
   public void config(){
     System.out.println("baby");
   };
}
public class interface_intro {
    public static void main(String[] args) {
        A obj;
        obj = new   B() ;
        obj.config();
        

        //we can directly access the variables
        int ans = A.age;
        System.out.println(ans);
      
        // A.area = 89;  
    }
}
