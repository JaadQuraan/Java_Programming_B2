package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {

        String strYear = "2023";
        int year1 = 2023;
        Integer year2 = 2023; //Autoboxing from -> int -> Integer
        Integer year3 = year1; //Autoboxing from -> int -> Integer

        System.out.println("Current year: " + year1); //2023
        System.out.println("Next Year: " + (year1+1));
        System.out.println("-------------------------");
        System.out.println("Current year: " + strYear); //2023
        System.out.println("Next Year: " + (strYear+1)); //20231
        System.out.println("---------------------------");
        //Convert String number to int number
        int numYear = Integer.parseInt(strYear); //String -> int
        System.out.println("Current year: " + numYear);
        System.out.println("Next Year: " +  (numYear+1));

        System.out.println("---------------------------");
//        String strNum = "2023Y";
//        int num2 = Integer.parseInt(strNum); //NumberFormatException -- You cannot convert non-numerical letters into number
//        System.out.println(num2 + 2);

//        String str3 = "1265asdf42";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: I am X years old");
        String response  = input.nextLine(); // "I am 5 years old"

        //I can split it " and assign it into array and get index of 2
        response.split(" "); //[I, am, 5, years, old]
        String ageStr = response.split(" ")[2]; //5
        int age = Integer.parseInt(ageStr);

        System.out.println("In five years you will be: " + (age+5) + " years old");
    }
}
