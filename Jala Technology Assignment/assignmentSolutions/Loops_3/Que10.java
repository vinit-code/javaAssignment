package assignmentSolutions.Loops_3;

class Que10 {
    
    public void solve() {
        int num = 111;
        if (isPalindromeNumber(num)) System.out.println("Palindrome number");
        else System.out.println("Not Plindrome Number");
    }   

    private boolean isPalindromeNumber(int num) {

        String numStr = num+"";
        int left = 0, right = numStr.length()-1; // Two finger algorithim is used
        boolean isPalindrome = true;
        
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                isPalindrome = false;
                break;
            } else {
                left++;
                right--;
            }
        }
        return isPalindrome;
    }
    
    
}
