package assignmentSolutions.methodOverloading_13;


/** 
 * 1. Java runtime gets confused between two same method signatures.
 * 2. There is ambiguity in front of Java runtime, how to bind methods call with available methods.
 * 3. This is getting resolved if there is methods with differnt signatures.
 */
public class Que5 {

    private int avg(double num1, double num2) {
        return (int)((num1+num2) / 2.0);
    } 


    public static void main(String[] args) {
        Que5 q5 = new Que5();
        double cgpa1 = 8.57d;
        double cgpa2 = 8d;

        System.out.println("First two year avg CGPA(rounded) = " + q5.avg(cgpa1, cgpa2));
        System.out.println("First two year avg CGPA(exact) = " + q5.avg(cgpa1, cgpa2));

    }
}
