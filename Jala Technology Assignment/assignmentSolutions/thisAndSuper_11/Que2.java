package assignmentSolutions.thisAndSuper_11;

public class Que2 {
    protected int a = 5;
    protected int b = 2;
}

class ChildClass extends Que2 {
    public void printParentClassVariables() {
        System.out.println("a = " + super.a);
        System.out.println("b = " + super.b);
    }
}
