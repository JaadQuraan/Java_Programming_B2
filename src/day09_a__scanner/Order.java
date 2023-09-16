package day09_a__scanner;

import java.util.*; //import the whole java package

/*
java.util.* using a wildcard symbol
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

*/
public class Order {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a product name: ");
        String productName = key.nextLine();
        System.out.print("Please, enter a price for a "+productName+": $");
        double price = key.nextDouble();
        System.out.print("How many " + productName + " do you want to buy?");
        int quantity = key.nextInt();

        key.nextLine(); //I want ENTER to be handled here
        System.out.print("What should we put on your order name: ");
        String orderName = key.nextLine();

        double total = price*quantity;
        //$orderName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
        String orderDetail = orderName+", your order for "+quantity+" "+productName+" has been placed.\nYour total is: $"+total;
        //System.out.println(orderName+", your order for "+quantity+" "+productName+" has been placed. Your total is: $"+total);
        System.out.println(orderDetail);
    }
}
