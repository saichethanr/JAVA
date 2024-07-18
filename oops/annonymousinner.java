package oops;


// class A{
//     public void show(){
//         System.out.println("sai");
//     }
// }

// // after compilation both the . class files are created 
// class B extends A{
//     public void show(){
//         System.out.println("goobe");
//     }
// }



//abstract + inner anonymoius
abstract class A{
    public abstract void show();
}

// after compilation both the . class files are created 
public class annonymousinner {
    public static void main(String[] args) {
        //this is the new days 
        //inner class
        A obj = new A(){
            public void show(){
                System.out.println("new show");
            }
        };
        obj.show();
    }
}
