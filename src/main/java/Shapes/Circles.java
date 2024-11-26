package Shapes;

import java.awt.*;

public class Circles extends Shape {
    private int radius;

    public Circles(int radius, Point position, Color color){
        super(position, color);
        this.radius = radius;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(position.x-radius,position.y-radius,2*radius,2*radius);
    }

}
