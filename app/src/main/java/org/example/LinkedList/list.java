package org.example.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

//Created a Grocery record
record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name)
    {
      this(name, "MEAT",1);
    }
}

public class list {

    public static void main(String[] args)
    {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("Ittani");
        groceryArray[1] = new GroceryItem("Moddah", "MEAT-industry",6);
        groceryArray[2] = new GroceryItem("matodzi", "Eggs", 7);
     //   groceryArray[3] = new GroceryItem("Brave", "Rice", 10);

        System.out.println(Arrays.toString(groceryArray));

        ArraylistMethod();

    }

    // String Array list
    public static void ArraylistMethod()
    {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ittani");
        names.add("Moddah");
        names.add("Hildah");
        names.add("Matodzi");
        names.add("andile");
        names.add("2025");

        System.out.println(names);

    }
}
