package assignmentSolutions.accessModifiers_8;

public class Que3 {
    protected String name = "Vinit";
    protected int age = 21;

    protected String aboutMe() {
        return "{name: " + this.name + ",\nage: " + this.age + "}";
    }

}


/** protected fields are visible only to the child classes */

class ChildInSamePackage extends Que3 {
    private String myname = name;
    private int myAge = age;

    private String childAboutMe() {
        return aboutMe();
    }
}

// Class from different packages will not be able to use methods and instance variabled from Que3, 
// if they want to use then they have to extend from Class Que3. 
