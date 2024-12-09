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
    }

    public  static void print()
    {
        System.out.println("......  .......   .....   ......   .....   .....   ..... ");
        System.out.println("The purpose of these is for new programmers to learn java basics.");
        System.out.println("......  .......   .....   ......   .....   .....   ..... ");
        System.out.println("Hi, I'm ittani Maemo, a junior software engineer in south africa\n");
    }
}
