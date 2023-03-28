package P06SOLIDExercise.output;

import P06SOLIDExercise.calculator.Calculator;
import P06SOLIDExercise.products.Product;

import java.util.List;

public class ConsoleOutput implements Output{
    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";

    private Calculator calculator;

    public ConsoleOutput(Calculator calorieCalculator) {
        this.calculator = calorieCalculator;
    }

    public void outputSum(List<Product> products) {
        System.out.printf((SUM) + "%n", calculator.total(products));
    }

    public void outputAverage(List<Product> products) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products));
    }
}
