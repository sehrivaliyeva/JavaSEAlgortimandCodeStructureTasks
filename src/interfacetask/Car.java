package interfacetask;

public class Car implements Vehicle {
    String model;
    double fuelEfficiency;    //(litr/100km);
    double lastMaintenanceMileage; //5000   //  (son texniki xidmətin keçildiyi km)
    double totalMileage;//10000    //(ümumi keçilmiş məsafə).

    public Car(String model, double fuelEfficiency, double lastMaintenanceMileage, double totalMileage) {
        this.model = model;
        this.fuelEfficiency = fuelEfficiency;
        this.lastMaintenanceMileage = lastMaintenanceMileage;
        this.totalMileage = totalMileage;
    }

    @Override
    public double calculateFuelCost(double distance) {
        double fuelCost = (distance * fuelEfficiency) / 100;
        return fuelCost * FUEL_PRICE_PER_LITER;
    }

    @Override
    public void performMaintenance() {
        if ((totalMileage - lastMaintenanceMileage) > 5000) {
            System.out.println("Need Service !");
        } else {
            System.out.println("No Service Needed !");
        }
    }
}
