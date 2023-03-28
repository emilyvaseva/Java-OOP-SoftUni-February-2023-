package P06SOLIDExercise.calculator;

import P06SOLIDExercise.products.Product;

import java.util.List;

public interface Calculator {
    double total(List<Product> products);
    double average(List<Product> products);

}
