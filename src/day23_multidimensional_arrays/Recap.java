package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr1 = {30, 90, 68, 360, 180};
        int [] arr2 = {180, 360, 30, 90, 68};

        System.out.println(arr1.length == arr2.length); //   5==5
        System.out.println();
        System.out.println("Before Sorting");

        //How can I print array? --> Arrays.toString(arrName); --> java.util

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Comparing arrays: " + Arrays.equals(arr1, arr2));

        System.out.println();
        System.out.println("After sorting");

        //How can I sort the array

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println("Comparing arrays: " + Arrays.equals(arr1, arr2)); //true

        System.out.println("-------------------------------------");
        String [] words =  {"hello",  "java", "Thursday"};
        System.out.println("Before String sort: " + Arrays.toString(words));

        Arrays.sort(words);
        System.out.println("After String sort: " + Arrays.toString(words));

        System.out.println();
        //  " " >  special characters" > numbers(small > big) >  UPPERCASE(alphabetical) > lowercase(alphabetical)
        String [] words2 =  {"hello",  "java", "Thursday", " ", "%", "23", "12"};
        Arrays.sort(words2);
        System.out.println(Arrays.toString(words2));
    }
}
