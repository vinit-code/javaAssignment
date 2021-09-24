package assignmentSolutions.javaIO_15;

import java.io.FileOutputStream;

public class Que2 {

    public static void main(String[] args) {
        
        try {
            FileOutputStream fos = new FileOutputStream("/home/vineet/Desktop/Jala Technology Assignment/assignmentSolutions/javaIO_15/text2.txt",true);
            String str = "My name is Vinit Pandey.";

            char[] charArr = str.toCharArray();

            for (char ch : charArr) {
                fos.write(ch);
            }
            fos.close();
            System.out.println("Write operation was successful");

        } catch (Exception e) {
            System.out.println("Error occured");
        }
        

    }
    
}
