package assignmentSolutions.exception_14;

public class Que4 {

    public double safeDivisionWithString(String num1, String num2) {

        double result = 0;

        try {

            double numnerator = Double.parseDouble(num1);
            double denominator = Double.parseDouble(num2);

            result = (double)numnerator/denominator;

        } catch (NumberFormatException numberFormatException) {
            
            System.out.println("Please give valid number");
        
        } catch (ArithmeticException arithmeticException) {

            System.out.println("Division by zero..../0");
        }

        return result;

    }
}
