package threadtask;

public class FoodStore {
    private volatile int foodCount = 0;

    synchronized void eatFood(String animal) {
        if (foodCount > 0) {
            foodCount--;
            System.out.println("Yem yeyildi !! qalan yem " + foodCount);
        } else {
            System.out.println("Yem tapilmadi !!");
        }
    }

    synchronized void addFood(int amount, String caretaker) {
        foodCount += amount;
        System.out.println(caretaker + " yem elave etdi"
        );
    }

    int getFoodCount() {
        return foodCount;
    }


}

