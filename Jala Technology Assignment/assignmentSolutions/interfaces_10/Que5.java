package assignmentSolutions.interfaces_10;

public interface Que5 {
    public void displayName();
}

interface Que52 {
    public void displayName();
}

class MyClass4 implements Que5, Que52 {

    @Override
    public void displayName() {
        System.out.println("My name is Vinit Pandey");
    }
    
}

