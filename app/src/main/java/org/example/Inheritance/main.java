package org.example.Inheritance;

public class main {
    public static void main(String args[])
    {
        Dog dog = new Dog("Brown",2, "PitBull","30m/s","South_Africa");
        Animal animal = new Animal("Bear","10m/s","Russia");

        print();
        System.out.println("......  .......   .....   ......   .....   .....   ..... ");
        System.out.println("The most dangerous dogs in the world :");
        System.out.println("\n " + dog.toString());
        System.out.println("\n" + animal.toString());
        printFish();
    }

    public  static void print()
    {
        System.out.println("......  .......   .....   ......   .....   .....   ..... ");
        System.out.println("The purpose of these is for new programmers to learn java basics.");
        System.out.println("......  .......   .....   ......   .....   .....   ..... ");
        System.out.println("Hi, I'm ittani Maemo, a junior software engineer in south africa\n");
    }

    public static  void printFish()
    {
        Fish fish = new Fish(2,3,"Tuna","20m/s","Africa");
        System.out.println("\nFish Section ............      .......     .......");
        System.out.println("\nFish type " + fish.getType() + "\nFish speed " + fish.getSpeed() + "\nFish Origin " + fish.getCountry() + "\n " + fish.toString());
        fish.MoveBackFin();
        fish.MoveMuscles();
    }
}
