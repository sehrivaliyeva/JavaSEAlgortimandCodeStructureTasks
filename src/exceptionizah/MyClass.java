package exceptionizah;

import java.io.FileReader;
import java.io.IOException;

public class MyClass {

    public static void file() throws IOException {
        FileReader fr = new FileReader("bshdsj.txt");
    }

    public static void main(String[] args) throws IOException {

        try {
            file();
            System.exit(0);
        }finally {
            System.out.println("qosulmani dayandirdim");
        }

    }
}
