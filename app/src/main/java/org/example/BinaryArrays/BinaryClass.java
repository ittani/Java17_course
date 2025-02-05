package org.example.BinaryArrays;
import java.util.*;

public class BinaryClass {


    public static void main(String[] args) {
        int[] printRandomArray = getRandomArray(10);
        List<Integer> addElements = new ArrayList<>(Arrays.asList(10,5,100,-55));

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

        // Reference Array

        System.out.println("\nReference Array\n");
        ReferenceArray();

        //
        System.out.println("\nMinimum Array\n");
        minimumArray();

    }

    public static int[] getRandomArray(int input) {
        Random random = new Random();
        int[] newInt = new int[input];
        for (int x = 0; x < input; x++) {
            newInt[x] = random.nextInt(100);

        }
        return newInt;
    }

    public static void RandomArray(int random) {
        int[] randomArray = new int[10];
        System.out.println("Initial Array: " + Arrays.toString(randomArray) + "\n");

        // let's fill the array
        Arrays.fill(randomArray, 7);
        System.out.println("filled Array: " + Arrays.toString(randomArray) + "\n");

//        return  randomArray;

        // passing a random array
        Random random1 = new Random();
        int[] playRandom = new int[5];
        for (int i : playRandom) {
            playRandom[i] = random1.nextInt(200);
        }

        System.out.println("Random arrays: " + Arrays.toString(playRandom));

        // declaring another array
        int[] thirdArray = Arrays.copyOf(playRandom, playRandom.length);
        Arrays.sort(thirdArray);

        System.out.println("Sorted array: " + Arrays.toString(thirdArray));
    }

    // binary search in an array
    public static void binarySearch() {
        String[] names = {"matodzi", "ittani", "letitia", "mpho", "thompho", "moddah"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // searching if ittani exists in the array list provided.
        if (Arrays.binarySearch(names, "ittani") >= 0) {
            System.out.println("\nFound ittani in the list");
        }
        // equal arrays

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("\nArrays are equal");
        } else {
            System.out.println("\nArrays are not equal");
        }

    }

    // Reference types

    public static void ReferenceArray() {
        int[] count = new int[10];
        int[] countNum = count;

        System.out.println("Count: " + Arrays.toString(count));
        System.out.println("CountNum: " + Arrays.toString(count));

        // lets initialise the fisrt element of CountNum array

        countNum[0] = -9;
        countNum[2] = 8;
        // lets review the results
        System.out.println("\nAfter change Count: " + Arrays.toString(count));
        System.out.println("After change CountNum: " + Arrays.toString(count));

    }

    // Minimum value found in the array
    public static void minimumArray() {
        ArrayList<Integer> getArrayElements = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements do you want to enter?");
        int input = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter your values");
        for (int i = 0; i < input; i++) {
            int value = scanner.nextInt();
            getArrayElements.add(value);
            System.out.println("Added: " + value);
        }

        int minimum = getArrayElements.get(0);

        for (int x = 1; x < getArrayElements.size(); x++) {
            if (minimum > getArrayElements.get(x)) {
                minimum = getArrayElements.get(x);
            }
        }
        System.out.println("The minimum values is: " + minimum);

        // we gonna reverse the array we just entered in the minimum function

        System.out.println("\n The reversed array list: ");
        Collections.reverse(getArrayElements);

//        for(int reverse = getArrayElements.size() - 1; reverse >= 0; reverse--)
//        {
//           System.out.println(getArrayElements.get(reverse));
//        }

        for(int display : getArrayElements)
        {
            System.out.println(display);
        }
    }

}
