package day16_loops;

import java.util.Scanner;

/*
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.    b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
*/
public class MiddleChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = input.next();
        int length = str.length();
        int mid = str.length() / 2;

        if (str.length() % 2 == 0) {// if the length of the String is even
            char firstMiddleChar = str.charAt(mid - 1);
            char secondMiddleChar = str.charAt(mid);
            System.out.println("Middle chars: " + firstMiddleChar + secondMiddleChar);
            System.out.println("Middle chars with substring method: " + str.substring((mid-1),(mid+1)) );
            //Since substring(startIndex,endIndex) does not include endIndex need to +1 here

        } else {
            //abcde --> 5/2 = 2
            //01234
            char middleChar = str.charAt(mid);
            System.out.println("Middle character is: " + middleChar);
            System.out.println("Middle char with substring method: " + str.substring((mid), mid+1));

        }
    }
}
