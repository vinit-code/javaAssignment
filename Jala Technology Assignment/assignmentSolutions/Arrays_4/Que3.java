package assignmentSolutions.Arrays_4;

class Que3 {

    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println(findIndex(arr,7));
    }

    protected int findIndex(int[] arr, int key) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        return index;
    }
    
}
