package assignmentSolutions.Loops_3;

class Que8 {
    /**
     * Armstrong Number :- If sum of cube of individual digits is equal to the number itself.
     */
    public void solve() {
        int num = 407;
        int initialNum = num;
        int tempSum = 0;
        while (num != 0) {
            tempSum += Math.pow(num % 10,3);
            num /= 10;
        }
        
        if (tempSum == initialNum) System.out.println("Armstrong number");
        else System.out.println("Not Armstrong number");
    }    
}
