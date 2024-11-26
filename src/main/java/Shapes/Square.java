package Shapes;
import java.awt.*;
import java.awt.Graphics;

// this class enables drawing a square on the park map
public class Square extends Shape {
    private int width;

    public Square(int width,Point position,Color color){
        super(position,color);
        this.width = width;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        // fillRect method: using values taken width and height fields
        g.fillRect(width,position.x,position.y,);
    }
}