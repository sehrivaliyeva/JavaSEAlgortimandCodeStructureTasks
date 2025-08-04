package shiptask;

public class Ship1  extends Spaceship {

    public Ship1(String name, int speed, int fuel) {
        super(name, speed, fuel);
    }

    @Override
    public void useAbility() {
        System.out.println(name+" hereket edir");
        super.useAbility();
    }
}
