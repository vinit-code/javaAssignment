package assignmentSolutions.interfaces_10;

public interface Que2 {

    // public void run();

    public boolean isAllImplemented();
    
}

class MyClass implements Que2 {

    // We must have to all the methods, we can not leave even a single method
    // We have two solutions in this such cases:
    // 1: Implement all the methods
    // 2: Now java supports default functions inside the interface.

    @Override
    public boolean isAllImplemented() {
        return false;
    }

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        myclass.isAllImplemented();
    }

}
