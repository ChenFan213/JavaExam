package org.example;

// Drone is a subclass of Park
// Drone also need to have radio frequency

class Drone extends Park{
    private int Radfreq;

    public Drone(String name,int id,int Radfreq){
        super(name,id); // inherits from class Park
        this.Radfreq = Radfreq;
    }

    // getter to get radio frequencies of the Drones
    public int getRadfreq(){
        return Radfreq;
    }
}
