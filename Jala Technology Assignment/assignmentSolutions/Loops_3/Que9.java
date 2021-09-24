package assignmentSolutions.Loops_3;

class Que9 {
    /**
     * Prime Number :- Number divisible by 1 and itself only.
     */
    public void solve() {
        int num = 407;
        if (isPrime(num)) System.out.println("Prime number");
        else System.out.println("Not Prime Number");
    }   
    
    private boolean isPrime(int num) {

        if (num == 1 || num == 2) return true;

        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            } 
        }

        return isPrime;
    }
}
