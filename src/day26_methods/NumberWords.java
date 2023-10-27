package day26_methods;

import java.util.Scanner;

/*1- One
2- Two
......

 */
public class NumberWords {
    //Return the correct word for the given number
    //Numbers should be from 1-10
    public static String numberAsWord (int num) {
        String []  words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        //                    0      1      2        3      4       5       6       7         8       9

        if(num>=1 && num <= 10){
            return words [num - 1];
        } else {
            return "Not valid number";
        }



    }

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("The number you input was: " + numberAsWord(num));
    }
}
