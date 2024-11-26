package org.example;
import Shapes.Circles;
import Shapes.Square;

import java.awt.*;

// this class draws the locations of Keeper, Lion, Drone on the canva
public class Map extends Canvas {

    private Circles circles;
    private Square square;

    public Map(){
        // draw a blue circle of radius 2 for the keepers
        this.circles = new Circles(2,new Point(200,200),Color.BLUE);
        // draw a red circle of radius 3 for the lions
        this.circles = new Circles(3,new Point(300,300),Color.RED);
        // draw a black square of width 3 for the drones
        this.square = new Square(3,new Point(100,100),Color.BLACK);
    }
    public void paint(Graphics g) {
        // draw a circle
        circles.draw(g);
        // draw a square
        square.draw(g);
    }
}
