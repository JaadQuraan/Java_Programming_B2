package day23_multidimensional_arrays;

import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3}; //This is in one location in the memory
        int [] b = {1, 2, 3}; //This is in another location in memory
        int [] c = a;
        //DO NOT COMPARE ARRAYS IN THIS WAY
        System.out.println(a == b);// false
        //if you use arithmetic operator to compare it will compare the memory location
        System.out.println(a == c); //true


        System.out.println();
        System.out.println(Arrays.equals(a, b)); //true. Now taking the values and compares them
        //System.out.println(a.equals(b));// We  cannot use just the equals() method with arrays

        int [] d = {3, 2, 1}; // Also compares index to index
        System.out.println(Arrays.equals(a, d)); // false
        Arrays.sort(d);
        System.out.println(Arrays.equals(a, d)); //true after sorting becomes [1, 2, 3]
    }
}
