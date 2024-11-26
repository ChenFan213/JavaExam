package org.example;

import Shapes.Shape;
import Shapes.Circles;
import Shapes.Square;

import java.awt.*;
import java.util.ArrayList;

// this class draws the locations of Keeper, Lion, Drone on the canva
public class Map extends Canvas {

    private Circles circles;
    private Square square;
    private ArrayList<Shape> shapes;

    public Map(){
        shapes = new ArrayList<>();
        // adding different shapes into the ArrayList, for Keeper/Lion/Drone respectively
        shapes.add((Shape) new Circles(2,new Point(400,400),Color.BLUE)); // Keeper
        shapes.add((Shape) new Circles(3,new Point(300,300),Color.RED)); // Lion
        shapes.add((Shape) new Square(3,3,new Point(500,500),Color.BLACK)); // Drone
    }
    public void paint(Graphics g) {
        // a paint method to draw each shape created
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
