package assignmentSolutions.Arrays_4;

class Que9 {
    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        
        int left = 0, right = arr.length-1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }


    }
    
    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;    
    }
 }
