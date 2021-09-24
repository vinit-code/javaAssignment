package assignmentSolutions.exception_14;

public class Que8 {

    public static void main(String[] args) {
        
        // This will give arithematic exception if args[1] is zero.
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        double result = (double)num1/num2;
        System.out.println("Dvision Result = " + result);
    }
    
}
