package com.company;

public class Farmer extends Character{
    boolean plowing;
    boolean harvesting;
    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1, false, false);
        this.plowing = false;
        this.harvesting = false;
    }

    public void plow(){
        this.plowing = true;
        System.out.println("Plowing....");
    }

    public void harvest(){
        this.harvesting = true;
        System.out.println("Time to harvest the crops!!!!");
    }

    public boolean isPlowing() {
        System.out.println("Plowing has begun? " + this.plowing);
        return plowing;
    }

    public boolean isHarvesting() {
        System.out.println("Harvesting has begun? " + this.harvesting);
        return harvesting;
    }

}
