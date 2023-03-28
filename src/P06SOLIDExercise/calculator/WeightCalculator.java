package P06SOLIDExercise.calculator;

import P06SOLIDExercise.products.Product;

import java.util.List;

public class WeightCalculator implements Calculator {

    public double total(List<Product> products){
        return products.stream().mapToDouble(Product::getKilograms).sum();
    }

    public double average(List<Product>products){
        return total(products) / products.size();
    }
}
