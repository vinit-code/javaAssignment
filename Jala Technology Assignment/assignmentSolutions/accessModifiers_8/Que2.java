package assignmentSolutions.accessModifiers_8;

class Que2 {

    double amount = 989.75;
    double rate = 9.23;
    int time = 3;

    double getSimpleIntrest() {
        return this.amount*this.rate*this.time;
    }

    
}

class AnyClass{
    // From Sub class we will not be able to call any private methods as well as instance variables
    public void solve() {
        // default values will be visible within the same package
        Que2 q2 = new Que2();
        double myAmount = q2.amount;
        double myRate = q2.rate;
        int time = q2.time;
        System.out.println(q2.getSimpleIntrest());
    }
    
}



