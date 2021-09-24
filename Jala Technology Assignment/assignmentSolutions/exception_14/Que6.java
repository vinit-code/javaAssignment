package assignmentSolutions.exception_14;

public class Que6 {

    public void solve() {
        String[] names = new String[] {"Abhishek", "Pulkit", "Vinit"};

        try {
            for (String name : names) {
                if (name.equals("Vinit")) {
                    throw new CustomException(name);
                }
            }
        } catch (CustomException e) {
            // handle exception
        }
        
    }
    
}

class CustomException extends Exception {

    public CustomException(String name) {
        System.out.println(name + " is devil");
    }
}
