package P03EncapsulationExercise.P04PizzaCalories;

public class Toppings {
    private String toppingType;
    private double weight;

    public Toppings(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        switch (toppingType){
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.toppingType = toppingType;
                break;
            default:
                throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight>=1 && weight<=50){
            this.weight=weight;
        }else {
            throw new IllegalArgumentException(this.toppingType + " weight should be in range [1..50].");
        }
    }

    public double calculateCalories(){
        double toppingTypeCoefficient = 0;
        switch (this.toppingType){
            case "Meat":
                toppingTypeCoefficient=1.2;
            case "Veggies":
                toppingTypeCoefficient=0.8;
            case "Cheese":
                toppingTypeCoefficient=1.1;
            case "Sauce":
                toppingTypeCoefficient=0.9;
        }
        return 2*this.weight*toppingTypeCoefficient;
    }
}
