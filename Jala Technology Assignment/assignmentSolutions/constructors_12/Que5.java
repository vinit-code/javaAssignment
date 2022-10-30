package assignmentSolutions.constructors_12;

public class Que5 {
    public Que5() {
        System.out.println("This is deafult constructor");
    }

    public Que5(String msg) {
        System.out.println(msg);
    }
}

class testClass {
    public void test() {
        Que5 q5 = new Que5(); // default constructor called automatically,

    }
}
