package assignmentSolutions.methodOverloading_13;



/**
 * 
 * 1. Java Compiler will not be able differentiate betweeen two methods of same signature.
 * 2. The confusion is with runtime binding.
 * 3. When Java runtime encounters with a function call it have to take decision of binding this call to available methods. 
 * 4. But when Java runtime sees availability of methods it finds 2 methods with same singnature, and thus there is ambiguity 
 * 5. This problem persistes even if we change the retun value type of the function, we have to change either no of parameters or data type of parameters 
 * 
 */

public class Que3 {

    private double avg(double num1, double num2) {
        return (num1+num2) / 2.0;
    } 
    

    // not allowed
    /*private double avg(double num1, double num2) {
        return (num1+num2) / 2.0;
    }*/

    public static void main(String[] args) {
        Que3 q3 = new Que3();
        double cgpa1 = 8.57;
        double cgpa2 = 8;

        System.out.println("First two year avg CGPA = " + q3.avg(cgpa1, cgpa2));
        System.out.println("First three year avg CGPA = " + q3.avg(cgpa1, cgpa2));

    }
}
