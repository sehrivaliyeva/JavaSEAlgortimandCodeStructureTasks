package tekrar;

public class Book {

    volatile int a;

    public static synchronized void write() {
        System.out.println("write");
    }

    public void write2() {
        a++;
        System.out.println("write2");
    }


}
