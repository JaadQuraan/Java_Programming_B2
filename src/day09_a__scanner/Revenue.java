package day09_a__scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        //1) First I need to import the package that has the Scanner class in it
        //2) Then I need to create an OBJECT of the Scanner class
        // *) If I want to use a class from a different package, I need to import it
        // *) If I want to use anything from that class, I need to create the object of it


        Scanner input = new Scanner(System.in); //input --> is a reference to the object
        //This is not a variable, you can refer to the object. This is an object not a primitive data type
        //Do not need to create another object can use the same scanner

        int number = 5;
        //Both of these are containers one has a variable name one has an object name
        System.out.print("Enter a price: $");
        double price = input.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();
        double revenue = price*quantity;
        System.out.println("Revenue: $"+ revenue);

        String name = "Loopcamp";
        //java.lang package is included by default
    }
}
