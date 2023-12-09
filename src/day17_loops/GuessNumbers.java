package day17_loops;

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretNumber = 77;
        int guess;

        do{
            System.out.print("Guess a number from 1 - 100: ");
            guess = input.nextInt();

            if (guess > secretNumber){ //90 > 77 --> Too high
                System.out.println(guess + ":Too high, try again");
            } else if (guess < secretNumber){
                System.out.println(guess + ":Too low, try again");
            }

        } while(guess != secretNumber);


        System.out.println("You guessed it correctly");



    }
}
