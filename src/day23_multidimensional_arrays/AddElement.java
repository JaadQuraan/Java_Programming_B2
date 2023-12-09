package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
    Ask a user: How many elements do you want to have in an array?
    I need to make an array with that size
    Now ask a user to enter the values for each element
 */
public class AddElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many elements do you want to have in an array?");
        int size = input.nextInt();
        int [] arr =  new int[size];
        //I made a new array with the size the user gave -> 3

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for index of : " + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.println("Array so far: "+ Arrays.toString(arr));

        //Add one more element which is 100 to the elements user gave
        int [] arr2 = Arrays.copyOf(arr,arr.length+1);
        arr2 [arr2.length-1] = 100;
        System.out.println("New array with addition: " + Arrays.toString(arr2));
        System.out.println();
        //Do not add only 100. Ask user how many new numbers they want to add
        System.out.println("How many elements do you want to add?");
        int num = input.nextInt();
        int [] arr3 = Arrays.copyOf(arr,arr.length+num);

        for (int i = arr.length; i < arr3.length; i++) {
            System.out.print("Enter value for index of : " + i + " : ");
            arr3[i] = input.nextInt();
        }
        System.out.println("New array with additions: " + Arrays.toString(arr3));
    }
}
