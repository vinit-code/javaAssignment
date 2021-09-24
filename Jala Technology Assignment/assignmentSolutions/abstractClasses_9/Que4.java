package assignmentSolutions.abstractClasses_9;

public abstract class Que4 {

    // non-abstract method
    public void greet() {
        System.out.println("Welcome, inside non-abstract method");
    }

    // abstract method
    public abstract void intoduce();
    
}

class SubClassOfAbstractClass3 extends Que4 {

    SubClassOfAbstractClass3 myClass = new SubClassOfAbstractClass3();

    public void solve() {
        myClass.greet();
    }

    @Override
    public void intoduce() {
        System.out.println("I am Vinit Pandey. I am 21 years old");
    }
}
