package assignmentSolutions.Loops_3;

class Que5 {
    public void solve() {
        int num1 = 45, num2 = 16, num3 = 26;
        int largestNum;

        if (num1 >= num2 && num1 >= num3) {
            largestNum = num1;
        
        } else if (num1 >= num2) {
            largestNum = num3;
        
        } else if (num2 >= num3) {
            largestNum = num2;
        
        } else {
            largestNum = num3;
        }
        
        System.out.println("Largest number is "  + largestNum);

    }    
}
