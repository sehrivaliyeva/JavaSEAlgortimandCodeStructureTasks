package interfacetask;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Bmw",12,2300,7000);
        Vehicle moto = new MotoCycle("HayaBusa",5,1000,2200,true);
        car.isReadyForTrip(100);
        System.out.println(Vehicle.calculateTotalCost(car, 300));
        System.out.println(car.calculateFuelCost(300));
        car.performMaintenance();
    }

}
