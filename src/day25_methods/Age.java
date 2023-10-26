package day25_methods;

import java.util.Scanner;

/*
    Make a method that calculates age and prints it
    Take the birth year as parameter
 */
public class Age {

    public static void  getAge(int year) {
        if(year > 2023){
            System.out.println("You have not been born yet");
        } else {
            System.out.println("Your age is: " + (2023 - year));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        getAge(birthYear);
    }

}
