package Shapes;
import java.awt.*;
import java.awt.Graphics;

// this class enables drawing a square on the park map
public class Square extends Shape {
    private int width;
    private int height;

    public Square(int width,int height,Point position,Color color){
        super(position,color);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        // fillRect method: using values taken width and height fields
        g.fillRect(position.x,position.y,width,height);
    }
}