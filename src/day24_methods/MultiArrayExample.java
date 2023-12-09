package day24_methods;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {


        int [] nums1 = {5, 10, 20, 10};       // 4 datatype int
        int [] nums2 = {5, 10, 100, 39, 19}; //  5 datatype int
        System.out.println(Arrays.toString(nums1));
        int [][] all = {nums1, nums2};      //   2 datatype is int array
        System.out.println(all); //hashcode
        System.out.println(Arrays.deepToString(all));
        System.out.println("First array in 2D array: " + Arrays.toString(all[0]));
        System.out.println("Second array in 2D array: " + Arrays.toString(all[1]));


        int [][] multi = {
                {90,30,20},
                {23, 12, 15, 456, 567, 34, 23},
                {23, 3425},
                {14}
        };
        //In this 2D array size is 4
        System.out.println(multi.length); //4
        System.out.println(multi[0].length); //3
        System.out.println(multi[0][1]); // 30
        System.out.println(Arrays.deepToString(multi));
        System.out.println(multi[3].length);
        System.out.println(multi[3][0]);
        //System.out.println(multi[3][1]); //out of bounds
    }
}
