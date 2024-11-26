package org.example;

// this class is the superclass of Keeper, Lion, and Drone
// As Keeper/Lion/Drone all have two things in common: Name and GPS tag ID

abstract class Park {
    private String name;
    private int id;

    public Park(String name,int id){
        this.name = name;
        this.id = id;
    }

    // getters to get name and GPS tag ID from instances of Keeper/Lion/Drone
    public String getName(){
        return name;
    }
    public int getID(){
        return id;
    }
}
