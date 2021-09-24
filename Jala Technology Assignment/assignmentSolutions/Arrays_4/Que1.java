package assignmentSolutions.Arrays_4;

class Que1 {

    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println(getSum(arr));
    }

    protected int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }
    
}
