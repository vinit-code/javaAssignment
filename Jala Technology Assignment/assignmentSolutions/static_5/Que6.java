package assignmentSolutions.static_5;


class Que6 {

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
        // Printing all static variables
        System.out.println("Name = " + Que6.name);
        System.out.println("Age = " + Que6.age);        
        
        // Printing all instace varibles
        Que6 q6 = new Que6();
        System.out.println("Highest Qualification " + q6.qualification);        
        System.out.println("Course Duration " + q6.courseDuration);        

    }
    
}
