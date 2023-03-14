package P03InheritanceExercise.P05Restaurant;

import java.math.BigDecimal;

public class Food extends Products{

    private double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
