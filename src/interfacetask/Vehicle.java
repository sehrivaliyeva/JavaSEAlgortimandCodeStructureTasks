package interfacetask;

public interface Vehicle {

    double FUEL_PRICE_PER_LITER = 1.5;

    double calculateFuelCost(double distance);

    void performMaintenance();

    default boolean isReadyForTrip(double distance) {
        if(distance<10000){
            logMaintenance("Vehicle is ready for trip");
            return true;
        }else {
            logMaintenance("Vehicle is not ready for trip");
            return false;
        }
    }

    static double calculateTotalCost(Vehicle vehicle, double distance) {
        double fuelCost = vehicle.calculateFuelCost(distance);
        double otherCost = 10;
        return fuelCost + otherCost;
    }

    private void logMaintenance(String message) {
        System.out.println(message);
    }

}
