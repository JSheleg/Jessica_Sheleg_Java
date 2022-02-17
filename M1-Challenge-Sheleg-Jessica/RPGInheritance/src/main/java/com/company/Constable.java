package com.company;

public class Constable extends Character{
    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5,false, false);
        this.jurisdiction = jurisdiction;
    }

    public void arrest(Character enemy){
        enemy.setArrested(true);
        System.out.println("Put your hands up " + enemy.getName() + " You are under arrest!!!!");
        enemy.isArrested();
    }

    public String getJurisdiction(){
        return jurisdiction;
    }
}
