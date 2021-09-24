package assignmentSolutions.methodOverloading_13;

public class Que1 {

    private double avg(double num1, double num2) {
        return (num1+num2) / 2.0;
    } 
    
    private double avg(double num1, double num2, double num3) {
        return (num1+num2+num3) / 3.0;
    }

    public static void main(String[] args) {
        Que1 q1 = new Que1();
        double cgpa1 = 8.57;
        double cgpa2 = 8;
        double cgpa3 = 9.57;

        System.out.println("First two year avg CGPA = " + q1.avg(cgpa1, cgpa2));
        System.out.println("First three year avg CGPA = " + q1.avg(cgpa1, cgpa2, cgpa3));

    }
}
