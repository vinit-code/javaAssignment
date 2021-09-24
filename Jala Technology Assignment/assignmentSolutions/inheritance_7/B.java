package assignmentSolutions.inheritance_7;

/** Class B depicts employee Object */
public class B  extends A{

    public String name = "James Gosling Employee";
    public int ssn = 2456;
    public String workAssigned = "code user authetication";
    public boolean workStatus = false;

    public String getAssignedWork() {
        return this.workAssigned;
    }

    public boolean getWorkStatus() {
        return this.workStatus;
    }

    @Override
    public String toString() {
        return "[name: " + this.name + ", age: " + this.age + ", marital status: "
         + this.maritalStatus + ", work assigned: " + this.workAssigned + ", work status: " + this.workStatus + "]";
    }


    
}
