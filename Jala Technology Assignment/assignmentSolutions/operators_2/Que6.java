package assignmentSolutions.operators_2;

public class Que6 {

    public void relationalOperators() {
        int num = 24;

        if (num < 0) {
            System.out.println("Negative number");
        
        } else if (num >= 0 && num > 10) {
            System.out.println("Single digit positive number");
        
        } else if (num >= 10 && num <= 99) {
            System.out.println("2 digit positive number");
        
        } else {
            System.out.println("3 digit positive number");
        }
    }
    
}
