package day26_methods;

import my_utilities.ArrayUtil;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1, 5, 6, 2};
        System.out.println(sumOfArray(arr));//since I am using method from same class, I can call it with just method name
        System.out.println("------------------");
        System.out.println(ArrayUtil.sumOfArray(arr)); //since I am using method from different I need to import the package first and then sue the class name
        // to call the method which is inside of that class

        System.out.println( sumOfArray ( 4,5,6,7 ));//Directly passing these values as an array
    }

    // ...
    //This parameter is called VAR ARGS -> which is the same data type of elements -> Same as array
//    public static int sumOfArray (int [] arr) {
//        int sum = 0;
//
//        for(int eachNum : arr){
//            sum += eachNum;
//        }
//        return sum;
//    }
    public static int sumOfArray (int ... arr) {
        int sum = 0;

        for(int eachNum : arr){
            sum += eachNum;
        }
        return sum;
    }
}