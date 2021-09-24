package assignmentSolutions.strings_6;

class Que8 {

    public void solve() {
        String language1 = "Java";
        String language2 = "JAVA";

        // equalsIgnoreCase()
        if (language1.equalsIgnoreCase(language2))  System.out.println("Java and JAVA are Same");
        else System.out.println("Java and JAVA are not same");

        // startWith() and endsWith()
        System.out.println("Java starts with 'J': " + language1.startsWith("J"));
        System.out.println("Java ends with 'd': " + language1.endsWith("d"));

        // compareTo()
        String uid1 = "1234567887654321";
        String uid2 = "1234567887654321";

        
        if (uid1.compareTo(uid2) == 0) {
            System.out.println("Same Person");
        } else {
            System.out.println("Different Person");
        }




    }

    



     
    
}
