package day39_b_exception.learn_exception;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int num1 = 0, num2 = 0;
        try{
            System.out.print("Enter number 1: ");
            num1 = input.nextInt();

            System.out.print("Enter number 2: ");
             num2 = input.nextInt();

            System.out.println("Division of num1/num2 is equal to: " + num1/num2); // 5/2 = 2

        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("Mismatch, enter 2 numbers");
        } catch (ArithmeticException e){
            System.out.println("Number 2 cannot be 0");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("FINALLY BLOCK");
            input.close();
        }
        System.out.println("Done");

//        try{
//            System.out.println("Division of num1/num2 is equal to: " + num1/num2); // 5/2 = 2
//        } catch (ArithmeticException e){
//            System.out.println("Number 2 cannot be 0");
//            e.printStackTrace();
//
//        }

        //1. Mismatch exception --> Five
        //2. ZeroDivisionException --> num2 = 0
    }
}
