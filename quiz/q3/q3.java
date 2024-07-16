package quiz.q3;

class Message{

    public void printMessage(int message) {
        System.out.println("Message primitive: " + message);
    }
    
    
    
    public void printMessage(Integer message) {
         System.out.println("Message object: " + message);
    }
    
}
    
    
    
    public class q3{
        public static void main(String []ars){
            Message ob=new Message();
            ob.printMessage(5);
        }
    }