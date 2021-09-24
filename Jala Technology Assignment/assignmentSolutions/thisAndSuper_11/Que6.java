package assignmentSolutions.thisAndSuper_11;

public class Que6 {
    protected int a = 5;
    protected int b = 2;

    public Que6() {
        System.out.println("Inside Base class contructor");
    }
}

class ChildClass6 extends Que6 {

    public ChildClass6() {
        super();
        System.out.println("Indise Child class constructor");
    }

    public void printParentClassVariables() {
        // this(), invalid because default contructor can only be called by JVM
        // super(), invalid because call to super class constructor can only be made inside constructor
        // of child class only.
        System.out.println("a = " + super.a);
        System.out.println("b = " + super.b);
    }
}
