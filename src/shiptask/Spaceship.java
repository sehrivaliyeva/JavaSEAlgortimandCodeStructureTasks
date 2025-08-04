package shiptask;

public class Spaceship {
    String name;
    int speed;
    int fuel;
    static int totalShips = 0;

    public Spaceship(String name, int speed, int fuel) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
        totalShips++;
    }

    public static int getTotalShips() {
        return totalShips;

    }

    public final void consumeFuel(int amount) {
        if (amount > 0) {
            fuel -= amount;
        }
    }

    public void useAbility() {
        System.out.println("umumi metoddur");
        consumeFuel(10);
    }

    public void race() {
        if (fuel > 0) {
            System.out.println(name + " " + speed + " km/s sürətlə yarışır!");
            consumeFuel(5);
        } else {
            System.out.println(name + " yanacaqsız qalıb!");
        }
    }
}