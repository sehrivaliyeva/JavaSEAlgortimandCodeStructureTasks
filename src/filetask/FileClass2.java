package filetask;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class FileClass2 {
    static void main(String[] args) {
        //C:\Users\HP\Desktop

        try (OutputStream os = new FileOutputStream("C:/Users/HP/Desktop/myfile.txt");
             OutputStreamWriter osw = new OutputStreamWriter(os)) {
            String text = "salam necesiz?";
            osw.write(text);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
