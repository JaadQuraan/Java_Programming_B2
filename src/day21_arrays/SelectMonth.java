package day21_arrays;

import java.util.*;

public class SelectMonth {
    public static void main(String[] args) {
        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //Indexes                         0

        System.out.println(months.length); // 12
        System.out.println(Arrays.toString(months));

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number that represents the month: ");
        int userNum = input.nextInt();
        if(userNum >= 1 && userNum <= 12){

            System.out.println(months[userNum - 1]);


        } else {
            System.out.println("Sorry, invalid input");
        }




        }
}
