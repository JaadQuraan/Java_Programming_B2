package day09_a__scanner;

import java.util.Scanner;

/*
     Ask the user to enter their age (byte),
     ask them to enter their favorite number (long),
     and ask them to enter their favorite book
     Print all the values from the inputs
  */
public class YourInfo {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = input.nextByte();
        //. dot operator. Helps to reach anything in the scanner class with the help of this reference
        System.out.print("Enter your favorite number: ");
        long favNum = input.nextLong();
        input.nextLine(); // This one handles the ENTER key that comes from previous
        System.out.print("Enter your favorite book: ");

        String book = input.nextLine();
        //input.next only accepts until the first space. nextline accepts enter on the keyboard
        System.out.println("You are "+age+" years old.\n"+
                            "Your favorite number is: "+favNum+
                            "\nYour favorite book is: "+book);



    }
}
