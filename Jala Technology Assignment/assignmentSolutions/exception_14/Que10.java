package assignmentSolutions.exception_14;

public class Que10 {

    public static void main(String[] args) {
        try {

            Class.forName("SomeRandomClassName");
        
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
}
