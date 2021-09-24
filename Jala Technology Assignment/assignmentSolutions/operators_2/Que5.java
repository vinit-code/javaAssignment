package assignmentSolutions.operators_2;

class Que5 {
    
    public void logicalAndOrNot() {

        /**
         *  condtion1 && condition2 ==> This will evaluate to true only if both conditions are simultaneously evaluation to true.
         *  condtion1 || condition2 ==> This will evaluate to true only if atleast one of the condtion is true.
         *  !condition ==> This inverts the logical value if condition is true then !condition is false and vise versa.
         */
        
        
        boolean flag1 = true, flag2 = true;

        if (flag1 && flag2) {
            System.out.println("Both Flags are evaluating to true");
        
        } else if (flag1 || flag2) {
            System.out.println("Either one Flag is evaluating to true");
        
        } else if (!flag1 && !flag2) {
            System.out.println("Both Flags are evaluating to false");
        }



    }
}
