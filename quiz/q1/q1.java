package quiz.q1;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Standard main method");
        main(42);  // Calling overloaded main method
        main("Overloading");
    }

    // Overloaded main method with an integer parameter
    public static void main(int number) {
        System.out.println("Overloaded main method with int: " + number);
    }

    // Overloaded main method with a String parameter
    public static void main(String message) {
        System.out.println("Overloaded main method with String: " + message);
    }
}
