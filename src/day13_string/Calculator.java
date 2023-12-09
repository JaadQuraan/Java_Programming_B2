package day13_string;

import java.util.Scanner;

/*
declare and assign 2 number variables
declare and assign a char variable for an operator

create a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other operator input: "invalid operator"
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creating the scanner object
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt(); //input is the object reference to the scanner object
        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Pick operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\tSelect: ");
        String operator = input.next(); //Don't need nextline because it will only be one word.
        // If you use nextLine need to handle other methods before

        int result = 0;
        String message="";
        boolean runOrNotRun = true;

        //Has to be same datatype
        switch (operator){
            case "+": case "plus":
                result = num1 + num2;
                break;
            case "-":
                case "minus":
                result = num1 - num2;
                break;
            case "*": case "multiply":
                result = num1 * num2;
                break;
            case "/": case "divide":
                result = num1 / num2;
                break;
            case "%": case "modulus":
                result = num1 % num2;
                break;
            default:
               message = "Invalid Operator";
               runOrNotRun=false;
                break;
        }
        //if default
        if (runOrNotRun) {
            System.out.println("\nYou entered numbers which are: "+num1+" and "+num2+ "\nWith the "+operator+ " operator you selected, " +
                    "the result is: "+result);
        } else {
            System.out.println(message);
        }


    }
}
