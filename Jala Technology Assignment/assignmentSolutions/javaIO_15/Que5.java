package assignmentSolutions.javaIO_15;

import java.io.FileReader;

public class Que5 {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/home/vineet/Desktop/Jala Technology Assignment/assignmentSolutions/javaIO_15/text.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char)i);
        }
        fr.close();
    }
    
}
