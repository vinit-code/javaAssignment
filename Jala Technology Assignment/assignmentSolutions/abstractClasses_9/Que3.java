package assignmentSolutions.abstractClasses_9;

public abstract class Que3 {

    // non-abstract method
    public void greet() {
        System.out.println("Welcome, inside non-abstract method");
    }

    // abstract method
    public abstract void intoduce();
    
}

class SubClassOfAbstractClass2 extends Que3 {

    SubClassOfAbstractClass2 myClass = new SubClassOfAbstractClass2();

    public void solve() {
        myClass.intoduce();
    }

    @Override
    public void intoduce() {
        System.out.println("I am Vinit Pandey. I am 21 years old");
    }
}
