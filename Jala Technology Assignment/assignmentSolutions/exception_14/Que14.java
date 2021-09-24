package assignmentSolutions.exception_14;

public class Que14 {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
        Class myClass = Class.forName("Que12");

        System.out.println("Class represented by " + myClass.toString());

        String fieldName = "obj";
        
        System.out.println(fieldName + " of my class " + myClass.getField(fieldName));
    }
    
}
