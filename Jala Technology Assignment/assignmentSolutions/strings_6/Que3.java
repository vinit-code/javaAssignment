package assignmentSolutions.strings_6;

class Que3 {


    public void solve() {
        // Method 1 : Using String litrel, string is getting selected from pool
        String fName = "Vinit";

        // Method 2 : Using new operator, memory get created in heap
        String lName = new String(" Pandey");

        int nameLength = (fName+lName).length();
        System.out.println("Name Length = " + nameLength);
    }

    



     
    
}
