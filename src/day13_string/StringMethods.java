package day13_string;

import java.util.Scanner;
import java.lang.String; //Java by default imports java.lang.String
public class StringMethods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = "loopcamp"; //IMMUTABLE --> IM-MYU-TIBIL
        str = str + " is nice"; //re-assigned and concatenation. Here we made a completely new String
        //immutable cannot change. Making a brand new one in the memory
        //Whenever you change the value of a string it creates a new one

        String name = "Valentina";
        System.out.println(name == "Valentina"); //true both are string literals. comparing memory location
        System.out.println(name == "valentina"); //false
        //NEVER use relational operators to compare the Strings

        System.out.println(name.equals("Valentina")); //true. Comparing values not the memory location
        System.out.println(name.equals("Parvana"));   //false.

        boolean result = name.equals("Loocamp");
        System.out.println(result);

        System.out.println(name.equalsIgnoreCase("VaLenTINA")); //Valentina. Ignore whether its capital or lowercase letter

        System.out.println("--------------------------------------");
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b); //false. comparing the memory location. Since both were made using the 'new' keyword, both of them are in diff location in heap memory
        System.out.println(a.equals(b)); // true. Here we are comparing value itself, no matter the location in the memory

        System.out.println(a.length()); // .length() returns the number of characters

        /*
        .equals("")
        .equalsIgnoreCase("")
        .length();
         */


    }
}
