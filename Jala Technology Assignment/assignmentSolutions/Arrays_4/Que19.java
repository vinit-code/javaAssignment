package assignmentSolutions.Arrays_4;

import java.util.ArrayList;

class Que19 {
    public void solve() {
        int[] arr = new int[100];

        for (int i = 1; i <= 100; i++) {
            arr[i-1] = i;
        }

        // Now we have an array which contains values from 1 to 100.

        ArrayList<Integer> absentList = new ArrayList<>(); 

        for (int i = 1; i <= 100; i++) {
            int index = binarySearch(arr,i);
            if (index < 0) absentList.add(i);
        }

        for (int num : absentList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private int binarySearch(int[] arr, int key) {

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            // Check if x is present at mid
            if (arr[m] == key)
                return m;
  
            // If x greater, ignore left half
            if (arr[m] < key)
                l = m + 1;
  
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
  
        // if we reach here, then element was
        // not present
        return -1;
    }
    
}
