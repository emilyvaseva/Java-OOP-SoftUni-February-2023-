package P06SOLID.p01_SingleResponsibility.p01_DrawingShape;

import P06SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.ConsoleRenderer;
import P06SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import P06SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class Main {
    public static void main(String[] args) {

        Shape shape=new Rectangle(5,10);
        DrawingManager drawingManager=new DrawingManagerImpl(new ConsoleRenderer());
        drawingManager.draw(shape);
    }
}
