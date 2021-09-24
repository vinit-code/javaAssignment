package assignmentSolutions.static_5;

class Que5 {
    // Goal :- Call static methods in instance methods
    
    // Static method
    public static void greet() {
        System.out.println("Welcome! you are in static method");
    }
    
    // Instace method
    public void solve() {
        greet();
    }
}
