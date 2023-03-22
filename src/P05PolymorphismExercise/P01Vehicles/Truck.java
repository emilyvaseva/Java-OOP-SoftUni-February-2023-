package P05PolymorphismExercise.P01Vehicles;

public class Truck extends Vehicle {
    private final static double ADDITIONAL_AC_CONSUMPTION=0.9;
    private final static double FUEL_LEAK_CORRECTION_PERCENTAGE=0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = this.fuelConsumption + ADDITIONAL_AC_CONSUMPTION;
    }

    public void refuel(double liters){
        liters=liters*FUEL_LEAK_CORRECTION_PERCENTAGE;
        this.refuel(liters);
    }
}
