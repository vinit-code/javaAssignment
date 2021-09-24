package assignmentSolutions.Arrays_4;

class Que8 {

    public void solve() {
        int[] arr = new int[] {10,20,30,40,50,60,70,80,90,100};

        int maxNum = getMax(arr);
        int minNum = getMin(arr);

        System.out.println("Maximum Number = " + maxNum + " Minimim NUmber = " + minNum);
    }

    protected int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) max = num;
        }

        return max;
    }


    protected int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) min = num;
        }

        return min;
    }
}
