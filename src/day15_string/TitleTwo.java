package day15_string;

import java.util.Scanner;

public class TitleTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name with title: ");
        String name = input.nextLine().toLowerCase();

        if(name.startsWith("mr.")  || name.startsWith("mister")){
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms.")  || name.startsWith("miss") || name.startsWith("madam")) {
            System.out.println("Hello Ma'am");
        } else if (name.startsWith("dr.")) {
            System.out.println("Hello Doctor");
        } else  {
            System.out.println("There is no title");
        }

        if(name.endsWith(" sr")){
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith(" jr")) {
            System.out.println("Nice you meet you Junior");
        } else{
            System.out.println("No Senior or Junior");
        }

    }
}
