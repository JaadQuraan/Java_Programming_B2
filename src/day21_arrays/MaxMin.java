package day21_arrays;

public class MaxMin {
    public static void main(String[] args) {


        int [] nums =  {23, 13, 65, 786, 23, 6, 7886};
        int max = nums[0]; // -2147483648;

        int min = nums[0]; // 2147483647

        //loop through and get each element
        //  then compare that to see if it is bigger /  less
        //      then store the min
        //      then store the max
        for (int i = 0; i < nums.length; i++) {
            int eachElement = nums[i];

            if(eachElement < min){
                min = eachElement;
            }
            if(eachElement>max){
                max = eachElement;
            }


        }
        System.out.println("The minimum value is: "+ min);
        System.out.println("The maximum value is: " + max);




    }
}
