package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method accepts an array
     * @return total of the elements
     */
    public static int sumOfArray (int [] arr) {
        int sum = 0;

        for(int eachNum : arr){
            sum += eachNum;
        }
        return sum;
    }

    public static int minInArray (int ... arr){
        int min = arr[0];

        for (int eachElem: arr) {
            if(eachElem < min){
                min = eachElem;
            }
        }
        return min;
    }
    public static int maxInArray (int ... arr){
        int max = arr[0];

        for (int eachElem: arr) {
            if(eachElem > max){
                max = eachElem;
            }
        }
        return max;
    }

    /**
     * This method accepts an int array and an int number
     * Then checks if the number is in the array
     * Return true if yes, otherwise return false
     */

    public static boolean containsInArray (int [] arr, int num){
        //[1,3,45,57,54] - 57

        for (int eachElem: arr) {
            if(eachElem == num){
                return true;
            }
        }
        return false;
    }
}
