package assignmentSolutions.Arrays_4;

class Que6 {

    public void solve() {
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = new int[] {6,7,8,9,10};

        copy(arr1,arr2);
    }

    private void copy(int[] source, int[] target) {
        if (source.length != target.length) {
            System.out.println("Copy can not be done!!!");
            return;
        }

        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
        
    }
    
}
