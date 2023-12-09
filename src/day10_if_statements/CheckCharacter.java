package day10_if_statements;
/*
create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

ex:
    'b'
    lowercase

ex:
    'U'
    uppercase
 */
public class CheckCharacter {
    public static void main(String [] args){
        char letter ='x';
        if('A' <= letter && letter <='Z'){
            System.out.println("UpperCase");
        }
        if('a' <= letter && letter <='z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Invalid");
        }

        /*
        if UPPERCASE--> Between A --- Z
            print uppercase

            if letter is bigger than 'A' and less than Z or equal print uppercase

         */
        int a =4;
        if(a>= 0 && a <=100){
            System.out.println("Number");
        }
    }
}
