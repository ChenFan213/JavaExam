package Shapes;
import java.awt.*;

// this class in the Shapes package enables drawing different shapes on the park map
public abstract class Shape {
    protected Point position;
    protected Color color;

    public Shape(Point position, Color color) {
        this.position = position;
        this.color = color;
    }
    public abstract void draw(Graphics g);
}
