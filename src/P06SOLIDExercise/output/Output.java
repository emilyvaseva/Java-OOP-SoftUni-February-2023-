package P06SOLIDExercise.output;

import P06SOLIDExercise.products.Product;

import java.util.List;

public interface Output {
    void outputSum(List<Product>productList);
    void outputAverage(List<Product>productList);
}
