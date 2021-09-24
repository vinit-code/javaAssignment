package assignmentSolutions.interfaces_10;

public interface Que3 {

    public void run();
    
}

class MyClass2 implements Que3 {

    @Override
    public void run() {
        System.out.println("Inside run() method implementation");
    }

    public static void main(String[] args) {
        Que3 myClass = new MyClass2();
        myClass.run();
    }

}
