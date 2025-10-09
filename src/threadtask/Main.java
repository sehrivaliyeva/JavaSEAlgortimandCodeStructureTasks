package threadtask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FoodStore store = new FoodStore();

        ExecutorService executor = Executors.newFixedThreadPool(6);

        Lion lion = new Lion(store);
        Monkey monkey = new Monkey(store);
        Rabbit rabbit = new Rabbit(store);
        
        Caretaker caretaker = new Caretaker(store);


        executor.submit(lion);
        executor.submit(monkey);
        executor.submit(rabbit);
        executor.submit(caretaker);


        executor.submit(() -> VipFeedingRoom.feedVip("lion"));
        executor.submit(() -> VipFeedingRoom.feedVip(" monkey"));

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("Proqram bitdi. Son yem miqdarı: " + store.getFoodCount());
    }
}
