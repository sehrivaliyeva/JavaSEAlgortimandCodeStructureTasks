package threadtask;

public class Caretaker implements Runnable {
    private FoodStore store;
    private String name;

    public Caretaker(FoodStore store) {
        this.store = store;
        this.name = "Caretaker";
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            store.addFood(5, name);
        }
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {

        }

    }
}
