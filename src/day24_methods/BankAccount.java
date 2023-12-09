package day24_methods;

import java.util.Arrays;
import java.util.Scanner;

/*
0 - full name
1- Account type
2- Account Number
3 - Balance
 */
public class BankAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ask a user to enter how many accounts there will be
        System.out.print("Enter how many accounts are there: ");
        int numOfAcc = scan.nextInt();
        String [][] allAccounts =  new String[numOfAcc][4]; //
        String [] questions ={"Name: ", "Account Type: ", "Account Number: ", "Balance : $"};

        scan.nextLine(); //Handles enter issue

        for (int i = 0; i < allAccounts.length; i++) {

            for (int j = 0; j < allAccounts[i].length; j++) {
                System.out.print(questions[j]);
                allAccounts[i][j] = scan.nextLine();
            }


        }
        System.out.println();
        System.out.println(Arrays.deepToString(allAccounts));
        for (String [] eachArr: allAccounts) {
            System.out.println(Arrays.toString(eachArr));
        }

        System.out.println("---------------------------------");
        String [] bankAcc1 = {"Tom Jerry", "Saving", "111-2222-3333", "100,000"};
        System.out.println("Number of elements: " + bankAcc1.length); //4
        System.out.println("Whole array: " + Arrays.toString(bankAcc1));
        System.out.println("Name: " + bankAcc1[0]);
        System.out.println("Account Type: " + bankAcc1[1] );
        System.out.println("Account Number: " + bankAcc1[2]);
        System.out.println("Balance: " + bankAcc1[3]);

        String [] bankAcc2 = {"Tom Jerry", "Saving", "111-2222-3333", "100,000", "Test", "test2", "test3",
                "test4", "test5","test10", "test11"};
        allAccounts[1] = bankAcc2;
//        System.out.println(Arrays.toString(allAccounts));



    }
}
