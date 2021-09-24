package assignmentSolutions.static_5;

class Que4 {
    // Goal :- Call instance methods in static methods


    // Instace method
    public void greet() {
        System.out.println("Welcome! you are in instace method");
    }
    
    // static method
    public static void solve() {
        Que4 q4 = new Que4();
        q4.greet();
    }
}
