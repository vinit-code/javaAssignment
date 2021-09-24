package assignmentSolutions.operators_2;

class Que7 {

    public void findGreaterAndSmaller(int num1, int num2) {
        int greater = num1, smaller = num2;
        if (num1 < num2) {
            greater = num2;
            smaller = num1;
        }
        System.out.println("Greater number = " + greater + " Smaller number = " + smaller);
    }
    
}
