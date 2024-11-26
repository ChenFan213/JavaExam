package org.example;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create array lists to benefit further addition of multiple keepers/lions/drones
        List<Keeper> keepers = new ArrayList<>();
        List<Lion> lions = new ArrayList<>();
        List<Drone> drones = new ArrayList<>();

        // instantiating and adding keepers
        Keeper geoff = new Keeper("Geoff",80,"4392");
        keepers.add(geoff);
        // lions
        Lion simba = new Lion("Simba",30,7);
        lions.add(simba);
        // drones
        Drone monitor1 = new Drone("Monitor1",124,128);
        drones.add(monitor1);

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