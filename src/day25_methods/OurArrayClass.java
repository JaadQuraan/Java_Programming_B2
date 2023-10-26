package day25_methods;

import java.util.Arrays;

public class OurArrayClass {

    public static void firstElem(int[] nums) {
        System.out.println("First Element: " + nums[0]);
    }

    public static void lastElem(int[] nums) {
        System.out.println("Last Element: " + nums[nums.length - 1]);
    }

    public static void printArr(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

    //print middle numbers
    public static void printMiddle(int[] nums) {
        if (nums.length % 2 == 0) {
            System.out.println("First middle: " + nums[nums.length / 2 - 1]); //EX: [1, 2, 3, 4]
            System.out.println("Second middle: " + nums[(nums.length / 2)]);
        } else {
            System.out.println("Middle: " + nums[nums.length / 2]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {34, 1, 2, 3, 45, 56, 6, 873, 256, 56};

        firstElem(numbers);
        lastElem(numbers);
        printArr(numbers);
        printMiddle(numbers);

        //int [] n = new int [] {1, 2, 34, 6}; //This one has a reference
        // firstElem(n);
        //This is same thing as lines above
        firstElem(new int[]{1, 2, 34, 6}); //No reference to call this one again.
        // Here directly used array when called the method
    }
}
