package assignmentSolutions.Arrays_4;

class Que7 {
    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};

        int pos = 2; // Here I am taking pos according to array index i.e. start from 0.
        int newValue = 100;

        if (pos < 0 || pos >= arr.length) {
            System.out.println("Insertion can not be performed");
            return;
        }

        int[] newArr = new int[arr.length+1];

        int i;
        for (i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[i] = newValue;
        i++;
        for (; i < newArr.length; i++) {
            newArr[i] = arr[i-1];
        }



        for (int num : newArr) {
            System.out.print(num + " ");
        }
            System.out.println();

    }    
}
