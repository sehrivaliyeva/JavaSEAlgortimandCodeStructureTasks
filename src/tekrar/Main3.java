package tekrar;

public class Main3 {
    static void main(String[] args) {

        Book book = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                book.write2();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                book2.write2();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                book3.write2();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
