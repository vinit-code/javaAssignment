package assignmentSolutions.Arrays_4;

import java.util.ArrayList;

class Que10 {
    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == curr) {
                    duplicates.add(curr);
                    break;
                }
            }
        }

        if (duplicates.size() == 0) System.out.println("No duplicates found");
        else {
            System.out.println("Duplicates values are...");
            for (int num : duplicates) {
                System.out.print(num + " ");
            }
                System.out.println();
        } 

    }
 }
