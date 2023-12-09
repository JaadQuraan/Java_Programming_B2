package day28_arraylist;

import java.util.ArrayList;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(800);

        System.out.println(nums.contains(200));//true
        System.out.println(nums.contains(500));//false

        //        int n = 5;
//        Integer n2 =  n; //autoboxing
    }
}
