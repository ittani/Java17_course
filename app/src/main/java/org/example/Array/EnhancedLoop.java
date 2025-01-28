package org.example.Array;


public class EnhancedLoop {

    public static void main(String[] args)
    {
        int[] newArray = {-8,5,7,2,0};

        System.out.println("Normal Array: \n");

        for (int i = newArray.length; i > 0; i--)
        {
            System.out.println(" " + newArray[i-1]);
        }

        System.out.println("\nHere is the list of reversed array\n");
        for (int x : newArray)
        {
            System.out.println(x);
        }

        // lets try to reverse the above array


    }
}
