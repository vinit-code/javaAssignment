package assignmentSolutions.javaIO_15;

import java.io.FileInputStream;

public class Que1 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/home/vineet/Desktop/Jala Technology Assignment/assignmentSolutions/javaIO_15/text.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char)i);
            }

            System.out.println();

        } catch (Exception e) {
            System.out.println("Error occured");
        }
    }
    
}
