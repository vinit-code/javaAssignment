package assignmentSolutions.interfaces_10;

public interface Que6 {

    default public void run() {
        System.out.println("Indide default run() method of interface");
    }
    
}

class MyClass5 implements Que6 {

    public static void main(String[] args) {
        MyClass5 myclass = new MyClass5();
        myclass.run();
    }

}
