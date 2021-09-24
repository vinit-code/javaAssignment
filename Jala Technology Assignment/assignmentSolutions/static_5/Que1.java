package assignmentSolutions.static_5;

class Que1 {

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
        
    }
    
}
