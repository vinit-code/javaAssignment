package assignmentSolutions.javaIO_15;

import java.io.FileWriter;

public class Que6 {

    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("/home/vineet/Desktop/Jala Technology Assignment/assignmentSolutions/javaIO_15/a.txt");
        fw.write("Writtern using FileWriter");
        fw.close();
        System.out.println("Write operation was successful");
    }
    
}
