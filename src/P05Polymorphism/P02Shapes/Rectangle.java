package P05Polymorphism.P02Shapes;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        super.setArea(width*height);
        return super.getArea();
    }

    @Override
    public double calculatePerimeter() {
        super.setPerimeter(2*width+2*height);
        return super.getPerimeter();
    }
}
