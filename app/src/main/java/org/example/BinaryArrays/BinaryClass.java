package org.example.BinaryArrays;

import java.util.Arrays;
import java.util.Random;

public class BinaryClass {


    public static void main(String[] args)
    {
        int[] printRandomArray = getRandomArray(10);

        System.out.println("\nArray list: \n" + Arrays.toString(printRandomArray));

        // lets sort the arrays

        Arrays.sort(printRandomArray);
        System.out.println("\nSorted Array values: \n" + Arrays.toString(printRandomArray));

        // RandomArray function
        System.out.println("\n");
        RandomArray(10);
       // System.out.println(printAnotherArray);
    }

    public static int[] getRandomArray(int input)
    {
        Random random = new Random();
        int[] newInt = new int[input];
        for(int x = 0; x < input; x++ )
        {
            newInt[x] = random.nextInt(100);

        }
        return newInt;
    }

    public static void RandomArray(int random)
    {
        int[] randomArray = new int[10];
        System.out.println("Initial Array: " + Arrays.toString(randomArray) + "\n");

        // let's fill the array
        Arrays.fill(randomArray,7);
        System.out.println("filled Array: " + Arrays.toString(randomArray) + "\n");

//        return  randomArray;

        // passing a random array
        Random random1 = new Random();
        int[] playRandom = new int[5];
        for (int i = 0; i < 5; i++ )
        {
            playRandom[i] = random1.nextInt(200);
        }

        System.out.println("Random arrays: "+ Arrays.toString(playRandom));

        // declaring another array
        int[] thirdArray = Arrays.copyOf(playRandom,playRandom.length);
        Arrays.sort(thirdArray);

        System.out.println("Sorted array: " + Arrays.toString(thirdArray));
    }
}
