package shiptask;

public class Ship2 extends Spaceship {
    public Ship2(String name, int speed, int fuel) {
        super(name, speed, fuel);
    }

    @Override
    public void useAbility() {
        System.out.println(name + "mueyyen hereket edir");
        super.useAbility();
    }
}
