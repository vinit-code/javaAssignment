package assignmentSolutions.Arrays_4;

import java.util.ArrayList;

class Que11 {
    public void solve() {
        int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[] {2,4,6,8,10,12,14,16,18,20};
        
        ArrayList<Integer> common = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            int curr = arr1[i];

            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == curr) {
                    common.add(curr);
                    break;
                }
            }
        }

        // But there might be duplicates in common, therefore for distinct common elements, 
        // we have to remove duplicates also.

        if (common.size() == 0) System.out.println("No Common Element Found");
        else System.out.println("Common Element Found");

    }
 }
