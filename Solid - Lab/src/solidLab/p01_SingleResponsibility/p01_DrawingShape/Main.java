package solidLab.p01_SingleResponsibility.p01_DrawingShape;

import solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import solidLab.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;

public class Main {
    public static void main(String[] args) {
        DrawingManager drawingManager = new DrawingManagerImpl();
        Shape shape = new Rectangle(1,5);
        drawingManager.draw(shape);
    }
}
