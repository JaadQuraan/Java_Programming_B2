package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        //When you make an array with new keyword you must give the size of it
        //Each element will have a default value depending on the datatype of array
        double [] arr = new double[4]; //Declare array and allocate space in the memory of 4 elements
        System.out.println(arr.length); // 4


        System.out.println(Arrays.toString(arr)); // [0.0, 0.0, 0.0, 0.0]

        arr[0] = 30.99;
        System.out.println(Arrays.toString(arr)); // [30.99, 0.0, 0.0, 0.0]
        arr[1] = 12.55;
        arr[2] = 10.20;
        arr[3] =  4; //Casted to double 4.0
        System.out.println(Arrays.toString(arr)); // [30.99, 12.55, 10.2, 4.0]
        //arr[4] = 45; //Since index 4 is not in range, it will throw EXCEPTION

        //We said that we CANNOT change the size of array
        //But can we change the value of the specific indexed element?

        arr[2] = 20.0; //We re-assigned the value at index2
        System.out.println(Arrays.toString(arr));



        arr =  new double[4]; // This creates a new array with 4 elements
                                //And arr references new object
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        arr[1] = 3;

        String [] strArr = new String [5];
        System.out.println(Arrays.toString(strArr)); //[null, null, null, null, null]
        //Null and empty ("") are not the same thing. Null is like nothing is there at that memory location

        //3rd but very rare declaration
        char []  arr2 = new char[]{1, 4, 5, 8};
        System.out.println(arr2.length);

    }
}
