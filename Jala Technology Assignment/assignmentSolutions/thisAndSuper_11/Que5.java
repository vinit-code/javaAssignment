package assignmentSolutions.thisAndSuper_11;

public class Que5 {
    protected int a = 5;
    protected int b = 2;

    public Que5() {
        System.out.println("Inside Base class contructor");
    }
}

class ChildClass5 extends Que5 {

    public ChildClass5() {
        super();
        System.out.println("Indise Child class constructor");
    }

    public void printParentClassVariables() {
        System.out.println("a = " + super.a);
        System.out.println("b = " + super.b);
    }
}
