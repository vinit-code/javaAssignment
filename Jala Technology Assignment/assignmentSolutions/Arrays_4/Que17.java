package assignmentSolutions.Arrays_4;

class Que17 extends Que3 {

    public void solve() {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,19,20};
        if (findIndex(arr, 12) != -1 && findIndex(arr, 23) != -1)   System.out.println("Both 12 and 23 exists in the array");
        else  System.out.println("Either both or atleast one of 12, 23 is not present in the array");
    } 
    
}
