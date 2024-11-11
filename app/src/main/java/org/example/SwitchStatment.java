package org.example;

public class SwitchStatment {

    public static void getName(String name)
    {
        switch(name)
        {
            case "ittani":
                System.out.println("Best software engineer");

            case "moddah":
                System.out.println("Best mechanical engineer");

            case "bafo":
                System.out.println("Best civil engineer");

            case "thompho":
                System.out.println("Best electrical engineer");

            default:
                System.out.println("You have no clue :) .......");
        }
    }
}
