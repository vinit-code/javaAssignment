package assignmentSolutions.constructors_12;

public class Que3 {

    private Que3() {
        System.out.println("This is private constructor, class wont be able to instantiated");
    }
    
    protected Que3(String msg) {
        System.out.println(msg + ", class will be instantiated by child class only");
    }

    public Que3(String msg1, String msg2) {
        System.out.println(msg1  + ", " + msg2);
    }


    
}
