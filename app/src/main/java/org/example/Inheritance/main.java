package org.example.Inheritance;

public class main {
    public static void main(String args[])
    {
        Dog dog = new Dog("Brown",2, "PitBull",30,"South_Africa");

        System.out.println("The most dangerous dogs in the world :");
        System.out.println("\n Dog Breed : " + dog.getType() + "\n Country of origin: " + dog.getCountry());
    }
}
