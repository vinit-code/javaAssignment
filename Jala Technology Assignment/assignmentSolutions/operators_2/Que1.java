package assignmentSolutions.operators_2;

class Que1 {
    
    public double add(double op1, double op2) {
        return op1+op2;
    }
    
    public double subtract(double op1, double op2) {
        return op1-op2;
    }

    public double multiply(double op1, double op2) {
        return op1*op2;
    }

    public double divide(double op1, double op2) {
        
        if (op2 == 0) {
            System.out.println("Can not perform division");
            return Integer.MIN_VALUE;
        } 
        return op1/op2;
    }
}
