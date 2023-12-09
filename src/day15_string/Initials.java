package day15_string;
/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();

        String initials = (""+firstName.charAt(0) + lastName.charAt(0)).toUpperCase(); // 'j' + 'b'--> number + number.
        // Have to concatentate it

        System.out.println("Your initials are: "+initials.toUpperCase());
        //.toUpperCase can be either line 21 or 24 or 17 and 19
        //Method works with String and can be applied to any String anywhere
    }
}
