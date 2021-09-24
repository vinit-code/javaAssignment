package assignmentSolutions.Arrays_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Que18 {
    public void solve() {
        int[] arr = new int[] {1,1,2,2,2,3,3,3,3,4,5,6,7,7,8,9,10};

        int[] newArr = removeDuplicates(arr);

        System.out.println("Array without duplicates");

        for (int num : newArr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
    
    protected int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                list.add(num);
            }
        }

        int[] newArr = new int[list.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }

        return newArr;  
    }
}
