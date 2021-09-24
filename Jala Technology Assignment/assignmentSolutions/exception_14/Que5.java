package assignmentSolutions.exception_14;

public class Que5 {
    
    public static void main(String[] args) {
        String numberStr = "87.20";
        int num;
        try {
            num = Integer.parseInt(numberStr);
    
        } catch (Exception e) {
            throw new NumberFormatException("Invalid number format");
        }
        
        
    }
    
    
}
