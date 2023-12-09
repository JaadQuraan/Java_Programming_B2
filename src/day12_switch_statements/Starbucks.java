package day12_switch_statements;

import java.util.Scanner;

/*

Declare price and calories variables

Ask the user to enter which size drink they want

Based on the drink size determine the price and calories of the order

At the end print the details of the order

    data:

        size: tall
        price: 2.50
        calories: 100

        size: grande
        price: 4.00
        calories: 150

        size: venti
        price: 4.50
        calories: 200

 */
public class Starbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 0.0;
        int calories = 0;
        boolean isNotValid = true;

        System.out.print("What size of drink you want: tall, grande, venti: ");
        String size = input.next();

        switch (size){
            case "tall":
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We do not have that size.");
                isNotValid = false;

        }

        if(isNotValid){
            System.out.println("Your order for a "+ size + "coffee is: $" + price + " and has " + calories + " calories");
        }

    }
}
