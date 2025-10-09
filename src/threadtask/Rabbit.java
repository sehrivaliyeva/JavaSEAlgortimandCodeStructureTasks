package threadtask;

public class Rabbit extends Animal {

    public Rabbit(FoodStore store) {
        super(store, "rabbit");
    }

    @Override
    void eat() {
        store.eatFood(name);
    }
}
