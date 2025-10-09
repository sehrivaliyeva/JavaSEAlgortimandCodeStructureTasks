package threadtask;

public class Lion extends Animal {
    public Lion(FoodStore store) {
        super(store, "lion");
    }

    @Override
    void eat() {
       store.eatFood(name);
    }
}
