package org.example.LinkedList.Bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Banks {

    public static void BankNames()
    {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> bank = new ArrayList<>();

//        bank.add(0,"ABSA");
//        bank.add(1,"FNB");
//        bank.add(2,"CAPITEC");
//        bank.add(3,"AFRICAN BANK");
//        bank.add(4,"SASFIN BANK");

//        System.out.println("\nHere is the list of all the banks\n");

        System.out.println("\n How many banks do you want to add? \n");
        int inputValue = scanner.nextInt();
        // A loop that will collect the name Banks

        System.out.println("\n Please enter the names: \n");

        for( int inputIndex = 0; inputIndex < inputValue; inputIndex++)
        {

  //         System.out.println(inputIndex + ": " + bank.get(inputIndex))

            bank.add(scanner.next());
        }

        System.out.println("\n*********** Well done! **************");
        System.out.println(" You have successfully caputured the banks names");
        System.out.println("*********** **************");
        System.out.println("*********** Well done! **************");

        System.out.println("\n----Here is the list of all the banks----\n");

        for(String print : bank)
        {
            System.out.println(print);
        }


    }

}
