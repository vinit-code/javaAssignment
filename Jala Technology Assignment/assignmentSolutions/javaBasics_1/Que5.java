package assignmentSolutions.javaBasics_1;

class Que5 {
    private String name = "Global";

    public void solve() {
        // Some line of code
        {
            String name = "Local";
            System.out.println(name); // This will access local variable
        }

        System.out.println(name); // This will access global variable
        
    }
}
