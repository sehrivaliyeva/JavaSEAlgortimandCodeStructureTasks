package threadtask;

public class Monkey extends Animal {
    public Monkey(FoodStore store) {
        super(store, "monkey");
    }

    @Override
    void eat() {
        store.eatFood(name);
    }
}
