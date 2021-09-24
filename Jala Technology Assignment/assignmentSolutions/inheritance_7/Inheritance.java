package assignmentSolutions.inheritance_7;

public class Inheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        
        // Call every method of each class using its own object/instance.
        a.greetPerson(); a.getMaritalStatus(); a.toString();

        b.greetPerson(); b.getMaritalStatus(); b.toString(); b.getAssignedWork(); b.getWorkStatus(); 
        b.toString();

        c.greetPerson(); c.getMaritalStatus(); c.toString(); c.getAssignedWork(); c.getWorkStatus(); 
        c.toString(); c.getDepartment(); c.getTeamSize(); c.toString();

        // Runtime Polymorphism
        // For methods
        A ref;
        ref = b;
        System.out.println(ref.toString());
        ref = c;
        System.out.println(ref.toString());

        // For instance variables
        ref = b;
        System.out.println(ref.name);

        ref = c;
        System.out.println(ref.name);
        
        












    }
}
