package assignmentSolutions.interfaces_10;

public interface Que4 {
    public void displayName();
}

interface Que42 {
    public void displayAge();
}

class MyClass3 implements Que4, Que42 {

    @Override
    public void displayAge() {
        System.out.println("I am 21 years old");
    }

    @Override
    public void displayName() {
        System.out.println("My name is Vinit Pandey");
    }
    
}

