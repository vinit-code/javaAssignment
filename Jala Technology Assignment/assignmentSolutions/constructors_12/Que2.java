package assignmentSolutions.constructors_12;


// Base class
class Que2 {

    public Que2() {
        System.out.println("This is default Constructor");
    }

    public Que2(String msg) {
        System.out.println(msg);
    }

}

class ChildClass2 extends Que2 {

    public ChildClass2() {
        super();
        System.out.println("Default Child class constructor");
    }

    public ChildClass2(String msg) {
        super(msg);
        System.out.println("Argumented Child class constructor");
    }

}
