package assignmentSolutions.inheritance_7;

/** Class A depicts Person Object */ 
public class A {

    public String name = "James Gosling";
    public int age = 45;
    public String maritalStatus = "unmarried";

    public void greetPerson() {
        System.out.println("Welcome " + this.name + " in Java World");
    }

    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    @Override
    public String toString() {
        return "[name: " + this.name + ", age: " + this.age + ", marital status: " + this.maritalStatus + "]";
    }
    
}
