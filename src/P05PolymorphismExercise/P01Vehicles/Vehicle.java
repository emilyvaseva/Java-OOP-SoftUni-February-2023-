package P05PolymorphismExercise.P01Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) {
        double fuelNeeded = distance*fuelConsumption;

        if (fuelNeeded>this.fuelQuantity){
            if (this instanceof Car){
                return "Car need refueling";
            }else {
                return "Truck need refueling";
            }
        }

        this.fuelQuantity=this.fuelQuantity-fuelNeeded;

        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        if (this instanceof Car){
            return String.format("Car travelled %s km",decimalFormat.format(distance));
        }else {

            return String.format("Truck travelled %s km",decimalFormat.format(distance));
        }
    }

    public void refuel(double liters) {
        this.fuelQuantity+=liters;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(),this.fuelQuantity);
    }
}
