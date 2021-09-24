package assignmentSolutions.methodOverloading_13;

public class Que4 {

    private double avg(int num1, int num2) {
        return (num1+num2) / 2.0;
    } 
    
    private double avg(double num1, double num2) {
        return (num1+num2) / 2.0;
    }

    public static void main(String[] args) {
        Que4 q4 = new Que4();
        double cgpa1 = 8.57;
        double cgpa2 = 8;

        System.out.println("First two year avg CGPA(rounded) = " + q4.avg((int)cgpa1, (int)cgpa2));
        System.out.println("First two year avg CGPA(exact) = " + q4.avg(cgpa1, cgpa2));

    }
}
