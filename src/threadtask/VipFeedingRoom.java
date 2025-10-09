package threadtask;

public class VipFeedingRoom {
    public static synchronized void feedVip(String animal) {
        System.out.println(animal + " VIP otaqda yem yeyir.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(animal + " VIP yemini bitirdi.");
    }
}
