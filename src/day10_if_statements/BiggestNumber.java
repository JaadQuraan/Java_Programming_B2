package day10_if_statements;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1>=num2 && num1>=num3){ //if num1 is bigger than other two,print
            System.out.println(num1+ " is the biggest number");
        }else if(num2>=num1 && num2>=num3){ //if num2 is bigger than other two, print
            System.out.println(num2+" is the biggest number");
        } else if(num3>=num1 && num3>=num2){ //if num3 is bigger than other two, print
            System.out.println(num3+" is the biggest number");
        }

    }
}
