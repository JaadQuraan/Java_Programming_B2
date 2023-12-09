package day17_loops;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user = 2,-1,-40,-30,-100
        int highest = -2147483648; //lowest integer number --> -2147483648
        int lowest = 2147483647; // highest integer number --> 2147483647

        // This makes sense when you are re-assigning. For the highest have minimum number and re-assign to highest number
        // The reason I gave smallest value to the highest container is because if user gives me bigger value than what it is now
        // so I can reassign it

        /*
        if userInput > highest --> {highest = userInput} ---> highest = 100 | 100 | 100
        if userInput < lowest ---> {lowest = userInput}  ---> lowest = 10 | 10 | 5
         */

        int counter = 1;

        while (counter <= 5) {
            System.out.print("Enter number: ");
            int userNumber = input.nextInt(); //declaring again and again. Why you are asking 5 times

            if(userNumber > highest){
                highest = userNumber;
            }

            if(userNumber < lowest){
                lowest = userNumber;
            }
            counter++;
        }

        System.out.println("Max: " + highest);
        System.out.println("Min: " + lowest);
    }
}
