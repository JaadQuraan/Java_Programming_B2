package day11_if_statements;

import java.util.Scanner;

/*
inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn
 */
public class LoginApp {
    public static void main(String[] args) {
        int myPinCode = 1234;
        int mySSN = 8213;

        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to ATM! \n\tPlease enter your pin-code: ");
        int enteredPinCode = input.nextInt();

        System.out.print("\tPlease enter last 4 digits of your SSN: ");
        int enteredSSN = input.nextInt();

        String message="";
        if(enteredPinCode == myPinCode && enteredSSN == mySSN ){
            message = "\n\tAuthentication successful";
            //System.out.println("\n\tAuthentication successful");
        } else {
            message = "\n\tAuthentication failed";
           // System.out.println("\n\tAuthentication failed");

            if(enteredPinCode != myPinCode){
                message = message + "\n\tInvalid pin code";
                //System.out.println("\t\tInvalid pin code");
            }
            if (enteredSSN != mySSN){
                message = message + "\n\tInvalid pin code";
                //System.out.println("\t\tInvalid ssn");
            }
        }

        System.out.println(message);
    }
}
