package buildingtask;

public class BuildingHome extends Base{
    private int floor;
    private boolean hasElevator;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        if (floor > 0 && floor != 0) {
            this.floor = floor;
        }
    }

    public boolean isHasElevator() {
        return hasElevator;
    }

    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    @Override
    public String toString() {

        return "BuildingHome{" +
                "floor=" + floor +
                ", hasElevator=" + hasElevator + super.toString();


    }
}
