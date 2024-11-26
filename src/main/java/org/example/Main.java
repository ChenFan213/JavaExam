package org.example;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {

        // create a 600 x 600 frame to map out things in the park
        Frame frame = new Frame("Wildlife Park Layout");
        frame.setSize(600,600);

        // instantiate a map to add onto the frame
        Map map = new Map();
        map.setSize(600,600);
        // adding whatever is on the map to the frame
        frame.add(map);

        frame.setVisible(true); // make tha frame visible
        frame.addWindowListener(new WindowAdapter() { // close frame when clicking close
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}