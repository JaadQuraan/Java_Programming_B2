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

    public static int indexOf (int [] arr,  int num) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static int indexOf (String [] str,  String word) {
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static int [] addElementInArr (int [] originalArr, int num){
        int [] newArr = Arrays.copyOf(originalArr,originalArr.length+1);
        newArr[newArr.length-1] = num;
        return newArr;
    }
    public static String [] addElementInArr (String [] originalArr, String str){
        String [] newArr = new String[originalArr.length+1];
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i] = originalArr[i];
        }
        newArr[newArr.length-1] = str;
        return newArr;
    }
    //TODO: Create a method that accepts two arrays(int [], int [])
    // and return the combined version
}
