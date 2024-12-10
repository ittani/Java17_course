package org.example.Inheritance;

public class Fish extends Animal {
    private int gills;
    private int fins;

    public Fish (int gills, int fins, String type, String speed, String country)
    {
        super("Tuna","10m/s","Africa");
        this.gills=gills;
        this.fins=fins;
    }

    public void MoveMuscles()
    {
        System.out.println("muscle moving");
    }

    public void MoveBackFin()
    {
        System.out.println("backfin moving");
    }

    public void move(String speed)
    {
        super.setSpeed(speed);
    }
}
