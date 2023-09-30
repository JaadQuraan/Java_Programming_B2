package day15_string;

import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter word 1: ");
//        String a = input.next();
//        System.out.print("Enter word 2: ");
//        String b = input.next();

        String a ="abc";
        String b = "xyz";

        // ---> axbycz

        String merged = "";
        //merged += "Merged: "+a.charAt(0)+b.charAt(0)+a.charAt(1)+b.charAt(1)+a.charAt(2)+b.charAt(2);
        merged += a.charAt(0);
        merged += b.charAt(0);

        merged += a.charAt(1);
        merged += b.charAt(1);

        merged += a.charAt(2);
        merged += b.charAt(2);

        System.out.println("Merged: " + merged);

    }
}
