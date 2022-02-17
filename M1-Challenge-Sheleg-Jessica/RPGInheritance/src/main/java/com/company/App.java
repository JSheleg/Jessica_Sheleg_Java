package com.company;

public class App {
    public static void main(String[] args) {
        Farmer john = new Farmer("John");
        Constable rob = new Constable("Rob", "City");
        Warrior max = new Warrior("Max");

        System.out.println("======Farmer's abilities======");
        System.out.println(john.toString());
        john.plow();
        john.isPlowing();
        john.harvest();
        john.isHarvesting();
        john.run();
        john.attack(rob);
        john.attack(max);
        john.arrested();
        System.out.println(john.toString());
        System.out.println("======Constable's abilities======");
        System.out.println(rob.toString());
        rob.run();
        rob.attack(john);
        rob.arrest(john);
        rob.attack(max);
        rob.arrest(max);
        rob.arrested();
        System.out.println(rob.toString());
        System.out.println("======Warrior's abilities======");
        System.out.println(max.toString());
        max.attack(john);
        max.attack(rob);
        max.arrested();
        System.out.println(max.toString());




        }

    }
