package day27_wrapper_arraylist;

import my_utilities.ArrayUtil;

public class ArrayIndexOf {
    public static void main(String[] args) {


        int[] arr = {12, 34, 4, 2, 23, 324, 345, 4, 64};
        //            0   1  2  3   4   5    6   7   8
        int num = 4;
        int index = indexOf(arr, num);
        System.out.println(index); //2
        System.out.println(indexOf(arr, num)); //2
        System.out.println(indexOf(arr, 345)); //6

        String [] words = {"hello", "bye","java"};
        System.out.println(indexOf(words,"java")); // 2


        System.out.println(ArrayUtil.indexOf(arr,12));
        //0 This was imported from the ArrayUtil class

        //make a method an int arr and a number then returns the index of it,
        // if it does not exist in array then return -1

    }


    public static int indexOf (int [] arr,  int num) {// [ 1, 2, 3 ] --> num = 4

        for (int i = 0; i < arr.length; i++) { // i<3 --> i =0; | i=1 | i = 2; | i = 3
            if(arr[i] == num) {                         // 1==4 | 2==4 | 3==4; All false
                return i;                               //Did not find matching return -1
            }
        }
        return -1;
    }

    //Can you overload this method and have it working with String arr and string

    public static int indexOf (String [] str,  String word) {
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }



    }

