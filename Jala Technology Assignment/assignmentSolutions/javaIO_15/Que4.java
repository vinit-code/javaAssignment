package assignmentSolutions.javaIO_15;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Que4 {

    public static void main(String[] args) {
        String data = "This is a line of text inside the file.";

        try {
            File fileObj = new File("/home/vineet/Desktop/Jala Technology Assignment/assignmentSolutions/javaIO_15/a.txt");
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream(fileObj);

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }


    
}
