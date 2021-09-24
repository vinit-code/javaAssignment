package assignmentSolutions.Arrays_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Que12 {
    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add((arr[i]));
                list.add(arr[i]);
            } 
        }
        int[] newArr = new int[list.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }
    }
 }
