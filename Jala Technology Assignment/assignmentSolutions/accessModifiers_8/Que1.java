package assignmentSolutions.accessModifiers_8;

class Que1 {

    private double amount = 989.75;
    private double rate = 9.23;
    private int time = 3;

    private double getSimpleIntrest() {
        return this.amount*this.rate*this.time;
    }

    public static void main(String[] args) {
        Que1 q1 = new Que1();
        System.out.println("Amount = " + q1.amount);
        System.out.println("Rate = " + q1.rate);
        System.out.println("Time = " + q1.time);
        System.out.println("Simple Intrest = " + q1.getSimpleIntrest());
    }
    
}

class SubClass extends Que1 {
    // From Sub class we will not be able to call any private methods as well as instance variables
}



