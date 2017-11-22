
package textreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

 
    public static void main(String[] args) {
     String data = "textfile.txt";
     
     try {
         FileReader freader = new FileReader(data);
         BufferedReader buffreader = new BufferedReader(freader);
         
         String text;
         while ((text = buffreader.readLine()) != null)
             System.out.println(text);
     }
     
     catch (FileNotFoundException err) {
         err.getMessage();
     }
     
     catch (IOException ioe) {
            ioe.getMessage();
        }
    }
    
}
