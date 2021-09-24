package assignmentSolutions.thisAndSuper_11;

public class Que3 {

    // Default constructor can not be called using this(), we can call only perametrized contructor using thid(args).

    // Default Constructor
    public Que3() {
        // this(); invalid it will become infinite loop
        System.out.println("Default Constructor called");
    }

    public void doSomething() {
        System.out.println("I am doing something");
    }

    
}
