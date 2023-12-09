package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int [] nums = {4, 10, 30, 20, 100};
        //             0  1   2    3
        //Has to be sorted if want to use this
        System.out.println(Arrays.binarySearch(nums, 4)); //
        System.out.println(Arrays.binarySearch(nums, 10)); //
        System.out.println(Arrays.binarySearch(nums, 100)); //
        System.out.println(Arrays.binarySearch(nums, 20)); //
        System.out.println(Arrays.binarySearch(nums, 200)); // -6 Would be in position 5, so 5 + 1 =6
        // and negative because it is not in array
        //It only works  when all elements are sorted
    }
}
