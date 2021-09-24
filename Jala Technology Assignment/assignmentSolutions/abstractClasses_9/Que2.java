package assignmentSolutions.abstractClasses_9;

public abstract class Que2 {

    // non-abstract method
    public void greet() {
        System.out.println("Welcome, inside non-abstract method");
    }

    // abstract method
    public abstract void intoduce();
    
}

class SubClassOfAbstractClass extends Que2 {

    // We can not instantiate abstract class.
    // We can use abstract class as a data type only.
    // We can only exted from abstract classe and extending class must override all the abstract 
    // methods defined in abstract class

    @Override
    public void intoduce() {
        System.out.println("I am Vinit Pandey. I am 21 years old");
    }
}
