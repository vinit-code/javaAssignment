package assignmentSolutions.constructors_12;

public class Que1 {

    // Default Constructor
    public Que1() {
        System.out.println("Inside default Constructor");
    }

    // Perametarized Constructor with single argument
    public Que1(String msg) {
        System.out.println(msg);
    }

    // Perametarized Constructor with two arguments
    public Que1(String msg1, String msg2) {
        System.out.println(msg1 + " " + msg2);
    }
}

class testQue1 {
    public static void main(String[] args) {
        Que1 q11 = new Que1();
        Que1 q12 = new Que1("Inside perametrazied constructor");
        Que1 q13 = new Que1("Inside perametrazied constructor", "with two agruments");
    }
}

