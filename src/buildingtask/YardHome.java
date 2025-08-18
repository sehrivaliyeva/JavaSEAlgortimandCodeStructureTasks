package buildingtask;

public class YardHome extends Base {
    private double yardArea;

    public double getYardArea() {
        return yardArea;
    }

    public void setYardArea(double yardArea) {
        if (yardArea > 100) {
            this.yardArea = yardArea;
        }

    }

    @Override
    public String toString() {
        super.toString();
        return "YardHome{" +
                "yardArea=" + yardArea +
                '}';
    }
}
