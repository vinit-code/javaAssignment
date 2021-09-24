package assignmentSolutions.javaBasics_1;


// Question 1. How to create a class, object, method and its signature
class Que1 {
    
    class MyClass {
        
        public String grit() {
            return "Welcome";
        }
    }

    public void solve() {

        MyClass myClass = new MyClass();

        System.out.println(myClass.grit());

    }
    
}

