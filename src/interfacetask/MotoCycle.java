package interfacetask;

public class MotoCycle implements Vehicle {
    String model;
    double fuelEfficiency;
    double lastMaintenanceMileage;
    double totalMileage;
    boolean hasSidecar;// (yan arabası olub-olmaması).

    public MotoCycle(String model, double fuelEfficiency, double lastMaintenanceMileage, double totalMileage, boolean hasSidecar) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.lastMaintenanceMileage = lastMaintenanceMileage;
        this.totalMileage = totalMileage;
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateFuelCost(double distance) {
        double hasSideCarCost = hasSidecar ? fuelEfficiency * 1.20 : fuelEfficiency;
        double fuelCost = (distance * hasSideCarCost) / 100;
        return fuelCost * FUEL_PRICE_PER_LITER;
    }

    @Override
    public void performMaintenance() {
        if ((totalMileage - lastMaintenanceMileage) > 2000) {
            System.out.println("Need Service !");
        } else {
            System.out.println("No Service Needed !");
        }
    }
}