package day15_string;

import java.util.Scanner;

/*
create a class LongestWithA
ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

Ex:
    "java"
    "mouse"
    "computer"

Output: java

Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
public class LongestWithA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 words: ");

        String wordOne = input.next(); //java
        String wordTwo = input.next(); //mouse
        String wordThree = input.next();//computer

       int wordOneLength  = wordOne.length(); //4
       int wordTwoLength  = wordTwo.length(); //5
       int wordThreeLength  = wordThree.length(); //8


        /*
        if my word contains "a" AND the length of String of that word is the biggest
         */

        String message  = "";

        //This will find if the biggest one has "a" in it and message will show that word

//        if(wordOne.contains("a") && wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength){
//            message ="Your longest word with 'a' is: "+ wordOne;
//
//        } else if(wordTwo.contains("a") && wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
//            message ="Your longest word with 'a' is: "+ wordTwo;
//
//        } else if(wordThree.contains("a") && wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength){
//            message ="Your longest word with 'a' is: "+ wordThree;
//        } else {
////            message =  "It does not have \"a\" in the word";
//            message = "Our longest word does not have \"a\"";
//        }
//
//        System.out.println(message);

        //java---mouse--computer
        //Find word which has a and it is longest one with another word with a
        //First we can find if each word has a
        // then compare the length



        //This way with are finding the words with "a"  only and comparing them
        if(!wordOne.contains("a")){ //false --> wordOne = "java"
            wordOne = "";
            wordOneLength = wordOne.length();
        }

        if (!wordTwo.contains("a")) { //true --> wordTwo =  ""
            wordTwo = "";
            wordTwoLength = wordTwo.length();
        }

        if (!wordThree.contains("a")) { //true --> wordThree = ""
            wordThree = "";
            wordThreeLength = wordThree.length();
        }




            if(wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength){
                message =  "Your longest word with 'a' is: "+ wordOne;
            } else if (wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
                message =  "Your longest word with 'a' is: "+ wordTwo;
            } else if (wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength) {
                message =  "Your longest word with 'a' is: "+ wordThree;
            }
        System.out.println(message);





       // This will find the longest one then check if it has a in it

        if(wordOne.contains("a") && wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength){
            message ="Your longest word with 'a' is: "+ wordOne;

        } else if(wordTwo.contains("a") && wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
            message ="Your longest word with 'a' is: "+ wordTwo;

        } else if(wordThree.contains("a") && wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength){
            message ="Your longest word with 'a' is: "+ wordThree;
        } else {
//            message =  "It does not have \"a\" in the word";
            message = "Our longest word does not have \"a\"";
        }

        System.out.println(message);
//        if(wordOne.contains("a") || wordTwo.contains("a") || wordThree.contains("a"))
//        {
//            if(wordOneLength >= wordTwoLength && wordOneLength >= wordThreeLength){
//
//        } else if(wordTwoLength >= wordOneLength && wordTwoLength >= wordThreeLength) {
//
//        } else if(wordThreeLength >= wordOneLength && wordThreeLength >= wordTwoLength){
//
//        }
//        } else {
//            System.out.println("None contains a");
//        }



    }
}
