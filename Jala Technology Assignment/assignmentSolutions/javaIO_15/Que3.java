package assignmentSolutions.javaIO_15;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Que3 {
    public static void main(String[] args) {
        File file = new File("/home/vineet/Desktop/Jala Technology Assignment/assignmentSolutions/javaIO_15/a.txt");
        BufferedInputStream bis = null;
 
        try {
            FileInputStream fis = new FileInputStream(file);
 
            bis = new BufferedInputStream(fis);
 
            byte[] buffer = new byte[1024];
 
            int bytes = 0;
            String fileContent;
 
            while ((bytes = bis.read(buffer)) != -1) {
                fileContent = new String(buffer, 0, bytes);
                System.out.print(fileContent);
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
}
