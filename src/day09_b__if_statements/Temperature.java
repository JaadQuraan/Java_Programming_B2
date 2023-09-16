package day09_b__if_statements;

import java.util.Scanner;

/*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
     */
public class Temperature {
    public static void main(String [] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = key.nextInt();
        //boolean result = temp >=70
        //if(result) {   ....   }

        if(temp >=70){
            System.out.println("Its a nice day");
            System.out.println("Go outside, but with your laptop to code java");
        } else {
            System.out.println("It's too cold");
            System.out.println("Code more java");
        }


    }
}
