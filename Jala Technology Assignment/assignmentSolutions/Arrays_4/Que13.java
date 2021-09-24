package assignmentSolutions.Arrays_4;


class Que13 extends Que8 {
    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int firstMax = getMax(arr);

        int secondMax = getSecondMax(arr,firstMax);
        
        System.out.println("Second Maximum number = " + secondMax);
    }

    private int getSecondMax(int[] arr, int fMax) {
        int sMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num == fMax) continue;
            if (num > sMax) sMax = num;
        }

        return sMax;
    }
 }
