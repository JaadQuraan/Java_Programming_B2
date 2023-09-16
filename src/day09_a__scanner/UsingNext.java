package day09_a__scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the day of the week? ");
        String day = input.nextLine();

        System.out.print("Enter your first name: ");
        String name = input.next();


        System.out.println("Today is: "+day);
        System.out.println("First name is: "+name);

        System.out.print("Enter your last name: ");
        String lastName = input.next();
        input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your bank account username: ");
        String userName = input.nextLine();//Since the one BEfore is also same as nextline(),
        // we do not need to add it. The problem  is when there are any other before a .nextline()
        //

        System.out.println("Last name is: "+lastName);
        System.out.println("Address is: "+address);

    }
}
