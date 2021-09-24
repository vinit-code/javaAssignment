package assignmentSolutions.accessModifiers_8.myPackage;
import assignmentSolutions.accessModifiers_8.Que3;


class ChildInDifferentPackage extends Que3 {
    
    private String myname = name;
    private int myAge = age;

    private String childAboutMe() {
        return aboutMe();
    }

}
