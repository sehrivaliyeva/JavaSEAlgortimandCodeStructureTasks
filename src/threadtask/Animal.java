package threadtask;

public abstract class Animal implements Runnable {
    FoodStore store;
    String name;

    public Animal(FoodStore store, String name) {
        this.store = store;
        this.name = name;
    }

    abstract void eat();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            eat();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
