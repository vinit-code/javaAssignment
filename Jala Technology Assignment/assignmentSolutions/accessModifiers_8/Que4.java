package assignmentSolutions.accessModifiers_8;

public class Que4 {
    public String name = "Vinit";
    public int age = 21;

    public String aboutMe() {
        return "{name: " + this.name + ",\nage: " + this.age + "}";
    }

}


class classInSamePackage {
    
    Que3 q3 = new Que3();

    private String myname = q3.name;
    private int myAge = q3.age;

    private String childAboutMe() {
        return q3.aboutMe();
    }
}

// Same methods can also be accessed via a class from different package also with same syntax
// Only the class must have to import from correct package. 
