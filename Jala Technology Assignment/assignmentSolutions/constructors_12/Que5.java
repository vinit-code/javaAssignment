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
        // Now we can not call constructor on demand
        // Default or Argumented constructor gets called automatically on object is instantiated
        // and we can not call constructors according to our demand.
        
        // They are called by JVM whenever new object gets created, and throughout the whole life cycle
        // of object it will not be called again.
        
    }
}
