package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList <Integer> original = new ArrayList<>(Arrays.asList(4,6,2,5,12,9,143,4,7,8,2));

        ArrayList <Integer> nums = new ArrayList<>(original);
        System.out.println("Before remove " + nums);

       nums.removeIf(each -> each %2 == 0);
        System.out.println("After remove " + nums);

        // -> predicate
        //Loop through nums ArrayList
        //Get each number
        //if each is divisible by 2 REMOVE that one

//        for (Integer each: nums) {
//            System.out.println(each);
//        }


        ArrayList <Integer> nums2 = new ArrayList<>(original);
        nums2.removeIf(each -> each > 10);
        System.out.println("After remove 2: " +  nums2);

    }
}
