package day05_variables;

public class CharExample {
    public static void main (String [] args) {
        //assign characters to the char data type

        char letterOne = 'a';
        char letterTwo = 'Z';
        char numberOne = '9';
        char specialOne = '$';

        //capital and lowercase have different ASCII
        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);

        System.out.println(letterOne + letterTwo); //97 +90 --> 187. Addition of decimals

        char letterThree = 65;
        System.out.println(letterThree); //Prints out 'A' dec value of 65
        //char letterFour = 65; //Invalid cannot store 2 characters into data type char
        System.out.println(letterOne + letterTwo +  letterThree + numberOne  + specialOne);
        System.out.println(letterOne + " "  + letterTwo + " " +  letterThree + " " + numberOne + " " + specialOne); //concatenation


        System.out.println("chars: " + letterOne  + letterTwo  +  letterThree  + numberOne + specialOne); //Concatenation
        System.out.println(letterOne  + letterTwo + "chars: " +  letterThree  + numberOne + specialOne);
        System.out.println(letterOne  + "chars: " + letterTwo +  letterThree  + "chars: "+numberOne + specialOne);
        //Concatenation starts from first string. Anything after FIRST string is


    }
}
