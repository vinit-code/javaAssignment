package assignmentSolutions.Arrays_4;

class Que15 {

    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,19,20};
        
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even Elements = " + evenCount + " Odd Elements = " + oddCount);
    } 
    
}
