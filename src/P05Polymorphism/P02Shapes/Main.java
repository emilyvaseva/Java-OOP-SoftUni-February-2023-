package P05Polymorphism.P02Shapes;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4,5);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
    }
}
