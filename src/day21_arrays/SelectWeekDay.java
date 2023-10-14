package day21_arrays;

import java.util.Scanner;

public class SelectWeekDay {
    public static void main(String[] args) {
        String [] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that represenets a week day");

        int userNum = input.nextInt();
        if(userNum >= 1 && userNum <= 7){
            System.out.println(weekDays[userNum-1]);
        } else {
            System.out.println("Sorry, invalid input");
        }

        //Ask a user to enter the valid input until it is actually valid

        while (userNum < 1 || userNum > 7) {
            System.out.println("enter a num in 1-7 range");
            userNum = input.nextInt();
        }

        System.out.println(weekDays[userNum - 1]);

    }
}
