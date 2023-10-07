package day18_loops;

import java.util.Scanner;

/*
    Count Words
    Given a sentence determine how many words are in the String.
    Ex:
    Input:
    This has multiple words
    Output:
    4
 */
public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String usrSentence = input.nextLine().trim();

        /*
            count words
                -count spaces + 1

                -count spaces?
                    loop through all characters and see how many characters there are
         */


        int countEmpty = 0;
        for (int i = 0; i < usrSentence.length(); i++) {
            //if character is equal to " ". I want to increase my count
            if (usrSentence.charAt(i) == ' '){
                countEmpty++;
            }
            //comparing space ASCII table number to the char
        }
        System.out.println("The number of empty spaces: " + countEmpty);
        System.out.println("You have: " + (countEmpty+1) + "words");
    }
}
