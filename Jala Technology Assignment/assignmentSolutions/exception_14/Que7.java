package assignmentSolutions.exception_14;

public class Que7 {


    public static void main(String[] args) {

        try {

            int num = Integer.parseInt("10.20");
    
        } catch (Exception e) {

            System.out.println("This will execute only if exception occures");

        } finally {
            System.out.println("This will get exceuted irrespective of exception occured.");
        }

    }

    
    
}
