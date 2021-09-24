package assignmentSolutions.static_5;

class Que7 {

    // two static variables 
    private static String name = "Vinit Pandey";
    private static int age = 21;

    // two instance variables
    private String qualification = "B.Tech";
    private int courseDuration = 4;

    // two static methods 
    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }

    // two instace methods
    public String getQualification() {
        return this.qualification;
    }

    public int getCourseDuration() {
        return this.courseDuration;
    }


    // main method
    public static void main(String[] args) {
        String myName = Que7.getName();
        int myAge = Que7.getAge();
        
        Que7 q7 = new Que7();
        String myQualification = q7.getQualification();
        int myCourseDuration = q7.getCourseDuration();

        String intoString = "My name is " + myName + ". I am " + myAge + " years old." 
        + "My highest Qualification is " + myQualification + ". My course duration was of " + myCourseDuration + " years.";

        System.out.println(intoString);
    }
    
}
