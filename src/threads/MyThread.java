package threads;

public class MyThread extends Thread {
    public MyThread(MyThread myThread1) {
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("ededim  " + i);
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
