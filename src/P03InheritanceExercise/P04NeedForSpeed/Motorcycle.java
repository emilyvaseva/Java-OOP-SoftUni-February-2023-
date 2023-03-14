package P03InheritanceExercise.P04NeedForSpeed;

public class Motorcycle extends Vehicle{

    private static final double DEFAULT_FUEL_CONSUMPTION=3;

    public Motorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
