package assignmentSolutions.interfaces_10;

public interface Que1 {

    public void run();
    
}

class MyThread implements Que1 {

    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.run();
    }
}
