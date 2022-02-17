package com.company;

public class Character {
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean arrested;
    private boolean running;


    public Character(String name, int strength, int health, int stamina, int speed, int attackPower, boolean arrested, boolean running) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.arrested = false;
        this.running = false;
    }

    public void run(){
        this.running = true;
        System.out.println("I am running");
    }

    public boolean isRunning() {
        System.out.println(this.name + " Is running? " + this.running);
        return running;
    }

    public boolean isArrested() {
        System.out.println(this.name + " Is Arrested? " + this.arrested);
        return arrested;
    }

    public boolean arrested() {
        this.arrested = true;
        System.out.println(this.name + " Was arrested for doing mean things!");
        return arrested;
    }

    public void attack(Character enemy){
        enemy.decreaseHealth(this.attackPower);
        System.out.println(this.name + " attacked " + enemy.name + " and their health was decreased by " + this.attackPower);
        System.out.println(enemy.name +"'s health is now " + enemy.health);
    }

    public void decreaseHealth(int amount) {
        this.health -= amount;
    }

    public void increaseStamina(int amount) {
        this.stamina += amount;
    }

    public void decreaseStamina(int amount) {
        this.stamina -= amount;
    }


    public void heal(int amount){
        this.health += amount;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackPower() {
        return attackPower;
    }




    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", arrested=" + arrested +
                '}';
    }
}
