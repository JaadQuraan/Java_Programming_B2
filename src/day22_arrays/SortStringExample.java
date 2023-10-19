package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {

        String [] arr = {"java", "api", "selenium", "database"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr); //Sorts in alphabetical order
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------------");

        String [] arr2 = {"java", "api", "Selenium", "12", "dabase", "$%",  "Apple",  "aPI",  " ", "34"};
        // [ , $%, 12, 34, Apple, Selenium, aPI, api, dabase, java]
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //Special Chars > numbers > uppercase(A-Z) > lowercase(a-z)
        //Multiple numbers will go in order of ASCII table

    }
}
