package day11_if_statements;

import java.util.Scanner;

/*
       you will have a number

       if the number is divisible by 3 print -> Fizz
       if the number is divisible by 5 print -> Buzz
       if the number is divisible by both 3 and 5 -> FizzBuzz
       if the number is not divisible by any of those, print just the number
 */
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String message = "";
        if(number % 3 == 0 && number % 5 == 0){
            message = "FizzBuzz";
            System.out.println(message);
        } else if (number % 3 == 0) {
            message = "Fizz";
            System.out.println(message);
        } else if (number % 5 == 0) {
            message = "Buzz";
            System.out.println(message);
        } else {
            System.out.println(number);
        }

        System.out.println("=========================");

        //Incorrect done just to explain else-if execution flow. Do more complicated one first
        if(number % 3 == 0){
            message = "Fizz";
        } else if (number % 3 == 0 && number % 5 ==0) {
            message = "FizzBuzz";
        }else if (number % 5 == 0) {
            message = "Buzz";
        } else{
            message = ""+number;
        }

        System.out.println(message);



    }
}
