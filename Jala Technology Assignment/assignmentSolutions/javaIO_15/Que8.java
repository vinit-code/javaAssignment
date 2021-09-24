package assignmentSolutions.javaIO_15;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Que8 {

    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("D:\\testout.txt");  
        BufferedWriter buffer = new BufferedWriter(writer);  
        buffer.write("Written using BufferedWriter.");  
        buffer.close();  
        System.out.println("Success");     
    }
    
}
