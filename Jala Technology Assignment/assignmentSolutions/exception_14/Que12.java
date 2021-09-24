package assignmentSolutions.exception_14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Que12 {

    public static void main(String[] args) {
       
        FileReader fr = null;
        try {
            fr = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(fr);

        String data = null;

        try {
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    
    }

    
}
