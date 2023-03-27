package P06SOLID.p01_SingleResponsibility.p01_DrawingShape;

import P06SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import P06SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import P06SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {


    private final Renderer renderer;

    public DrawingManagerImpl(Renderer renderer) {
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
renderer.render(shape);
    }
}
