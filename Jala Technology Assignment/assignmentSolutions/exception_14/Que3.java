package assignmentSolutions.exception_14;

public class Que3 {

    private double safeDivision(double numerator, double denominator) throws Exception {

        if (denominator == 0) {
            throw new Exception();
        }

        return (double)numerator / denominator;

    }

    public static void main(String[] args) {
        // we can not call a method which throws exception without try catch block
        Que3 q3 = new Que3();
        // q3.safeDivision(48, 56);

        
    }
    
}
