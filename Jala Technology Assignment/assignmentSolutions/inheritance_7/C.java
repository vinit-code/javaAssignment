package assignmentSolutions.inheritance_7;

/** Class C depicts Manager Object */
public class C  extends B {

    public String name = "James Gosling Manager";
    protected String department = "backend-developement"; 
    protected int teamSize = 15;

    public String getDepartment() {
        return this.department;
    }

    public int getTeamSize() {
        return this.teamSize;  
    }

    @Override
    public String toString() {
        return "[name: " + this.name + ", age: " + this.age + ", marital status: "
         + this.maritalStatus + ", work assigned: " + this.workAssigned + ", work status: "
          + this.workStatus + ", department: " + this.department + ", team size: " + this.teamSize + "]";
    }

}
