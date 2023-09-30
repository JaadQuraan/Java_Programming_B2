package day14_string;

import java.util.Scanner;

/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp2023"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input obj name --- new Scanner(System.in) is the obj in memory
        System.out.print("Enter your username: ");
        String username = input.next();
        username = username.toLowerCase(); // I made my username to lowercase

        System.out.print("Enter your password: ");
        String password = input.next();
        String actualpasswordInDB = "loopcamp2023";

    /*
    if(condition) - length bigger than 8 and password match
     ..................
     else
     ...........
     Does it include the 8? No here
    */
        System.out.println();

        if(username.equals("java") && password.length() > 8 && password.equals(actualpasswordInDB)){
            System.out.println("You are logged in");
        } else {
            if(!username.equals("java")){
                System.out.println("Username is invalid");
            } else{
                System.out.println("Invalid password");
            }

        }

    }
}
