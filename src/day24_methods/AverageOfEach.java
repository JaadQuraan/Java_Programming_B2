package day24_methods;

public class AverageOfEach {
    public static void main(String[] args) {

        int [][] nums =  {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };
//        System.out.println(nums.length); //3
//        System.out.println(nums[2].length); //3
        int sum = 0;
        int totalLength =  0;

        //Can you get the average of total?
        // average : totalSum / totalLength
        for (int [] eachArray:nums) {

//            int eachSum = 0;

            for (int each : eachArray) {
                sum += each;
//                eachSum  += each;
            }
            totalLength += eachArray.length; // 4 + 3 + 3 = 10
//            System.out.println("Sum after eahc cycle: " + eachSum);
//            System.out.println("Average of each: " + (eachSum / eachArray.length));
        }
        System.out.println("Total sum: " + sum);
        int average = (sum / totalLength);
        System.out.println("The average is: " + (sum / totalLength));
        System.out.println("The average is: " + average);


        //Do it with traditional loop / fori loop


    }
}
