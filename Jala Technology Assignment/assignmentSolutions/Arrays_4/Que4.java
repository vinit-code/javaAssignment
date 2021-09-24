package assignmentSolutions.Arrays_4;

class Que4 extends Que3 {

    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        if (findIndex(arr, 8) == -1) System.out.println("Key is not present");
        else System.out.println("Key is present in array");
    }

    
}
