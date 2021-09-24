package assignmentSolutions.exception_14;

public class Que2 {


    // This will give runtime exception if we pass denominator as 0, divisionByZero a class of exception
    private double safeDivision(double numerator, double denominator) {
        
        double result = 0.0;
        try {
            result = (double)numerator/denominator; 
        } catch (Exception e) {
            System.out.println("Can not divide by 0 (/0 error).");
            result = Double.MIN_VALUE;
        }

        return result;
        
    }
    


}
