package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {

        int [] nums =  {30, 12, 150, 12};
       //Traditional fori loop
        for (int i = 0; i < nums.length; i++) {

            System.out.println("Traditional fori loop: " + nums[i]);

        }

        System.out.println();
        //For Each loop:
        //Not as preferable if you want to use indexes as fori loop
        for(int each : nums){ // 1st cycle => int each 30 | 2nd cycle -> int each = 12 .....
            System.out.println("ForEach loop: " + each);
//            if(each == 12){ // I can stop the loop based on the value
//                break;
            }

        //Change the value of the 3rd element in the array

        //It is better to use fori loop if we need to work with index
        for (int i = 0; i < nums.length; i++) {
            if(i == 2){
                nums[i] = 34;
            }

        }
        System.out.println("--------------------------------------");

        String [] classes = {"java", "soft skills", "api", "db", "selenium"};

        for( String element: classes ){ // (datatype element : array) datatype has to match what array holds
            System.out.println("For Each Loop: " + element);

        }

        //Traditional
        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional: " + classes[i]);
        }

        System.out.println("--------------------------------------");

        double [] prices = {2.3, 45.7, 34, 21.2};
        for (double eachPrice: prices) {
            System.out.println("For Each Loop: $" + eachPrice);
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Traditional Prices: $" + prices[i]);
        }
    }
}
