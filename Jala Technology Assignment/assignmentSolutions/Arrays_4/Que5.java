package assignmentSolutions.Arrays_4;

class Que5 extends Que3 {
    

    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int removeNum = 6;
    
        int removeIndex = findIndex(arr,removeNum);

        if (removeIndex == -1) {
            System.out.println("Element is not present");
            return;
        }

        leftShift(arr,removeIndex);

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

    }


    protected void leftShift(int[] arr, int startIndex) {

        for (int i = startIndex+1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = 0;

    }


}
