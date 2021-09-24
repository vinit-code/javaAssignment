package assignmentSolutions.interfaces_10;

public interface Que8 {

    public String name = "Vinit Pandey";
    public int age = 21;

    public void introduce();

}

class MyClass8 implements Que8 {

    public void solve() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        this.introduce();
    }

    public void introduce() {
        System.out.println("Hi, My name is " + name + ". I am " + age + " years old");
    }

}


