package day28_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(10); //OBJECT 10
        nums.add(600);
        nums.add(700);
        nums.add(800);
        nums.add(900);
        nums.add(4000);
        nums.add(10); //index 10

        //System.out.println(nums.remove(0));
        System.out.println(nums); //
        nums.remove(10);
        System.out.println(nums);
        nums.remove(Integer.valueOf(10));
        System.out.println(nums);

        Integer i = 200;
        nums.remove(i); //takes i as an object.This is an integer not just an int
        System.out.println(nums);

        StringUtil.isPalindrome("hello");

        nums.remove((Integer)300); //We cast int into Integer. This removes the obj 300
        System.out.println(nums);
    }
}
