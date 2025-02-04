package org.example.BinaryArrays;
import java.util.Arrays;
import java.util.Random;

record Person(String name, long phone) {}
public class BinaryClass {


    public static void main(String[] args)
    {
        int[] printRandomArray = getRandomArray(10);

        System.out.println("\nArray list: \n" + Arrays.toString(printRandomArray));

        //sorting the arrays

        Arrays.sort(printRandomArray);
        System.out.println("\nSorted Array values: \n" + Arrays.toString(printRandomArray));

        // RandomArray function
        System.out.println("\n");
        RandomArray(10);
       // System.out.println(printAnotherArray);

        // Binary search in an array
        System.out.println("\nBinary Search Array\n");
        binarySearch();
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

    // binary search in an array
    public static void binarySearch()
    {
        String[] names = {"matodzi","ittani","letitia","mpho","thompho","moddah"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // searching if ittani exists in the array list provided.
        if (Arrays.binarySearch(names, "ittani") >= 0)
        {
            System.out.println("\nFound ittani in the list");
        }
        // equal arrays

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if (Arrays.equals(s1,s2))
        {
            System.out.println("\nArrays are equal");
        }
        else{
            System.out.println("\nArrays are not equal");
        }




    }

}
