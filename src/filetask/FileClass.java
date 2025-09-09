package filetask;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {
    static void main(String[] args) {

        try (FileWriter fw = new FileWriter("evo.txt",true)) {
            String text = "salam fayla melumat yazdim";
            fw.write(text);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        //--------------------------------------------------------

        File file = new File("evo.txt");
        try (FileReader fr = new FileReader(file)) {
            char[] arr = new char[(int) file.length()];
            fr.read(arr);

            for (char c : arr) {
                System.out.print(c);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

}


