package day39_b_exception.learn_exception;

import java.util.Scanner;

public class FirstTry {
    public static void main(String[] args) {
        //Exception thing that fails and stops execution flow

        System.out.println("First Line");

        try {
            // Scanner input = new Scanner(System.in);
            String word =  "word";
            System.out.println(word.charAt(4));
        } catch (Exception e){
            System.out.println("Exception Message: Exception Happened. Come back and check");
           // e.printStackTrace(); //Prints the error message
           System.out.println("e.getMessage() = " + e.getMessage());
        }
       // Scanner input = new Scanner(System.in);


        //String word = 45; //Compile time errors / check error
        //I cannot even compile your code


        System.out.println("Last line"); //Now this runs since we handled the exception
        //Exceptions can stop the execution flow
        //Errors are non direct code related issues
        //Compile time /checked exception
        //Unchecked exceptions handled with try catch
    }
}
