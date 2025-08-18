package buildingtask;

public class Villa extends Base {
    private boolean hasPool;
    private int garageCapacity;

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public int getGarageCapacity() {
        return garageCapacity;
    }

    public void setGarageCapacity(int garageCapacity) {
        if (garageCapacity > 50) {
            this.garageCapacity = garageCapacity;
        }
    }

    @Override
    public String toString() {
        super.toString();
        return "Villa{" +
                "hasPool=" + hasPool +
                ", garageCapacity=" + garageCapacity +
                '}';
    }
}
