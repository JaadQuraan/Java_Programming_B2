package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String str = "monday,tuesday,wednesday,thursday,friday";
        String [] days = str.split(","); // This will take the String and separate by the commas. 5 elements
        //It can automatically assign it to String array

        for (String eachElem : days) {
            System.out.println(eachElem); //Gets each of them one by one
        }
        System.out.println();

        String [] days2 = str.split("day");
        for (String each : days2) {
            System.out.println(each);
        }
        System.out.println("--------------------");
        String months = "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec";

        //Gets first month but would take really long, not useful
//        String month1 = months.substring(0, months.indexOf("-"));
//        System.out.println(month1);

        String [] monthArray = months.split("-");
        for (String eachMonth : monthArray) {
            System.out.print(eachMonth +  " ");
        }
        System.out.println();
        System.out.println("------------------------------------");

        // "jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec"
        String [] arr2 =  months.split("y-");
        for (String eachPart : arr2) {
            System.out.println(eachPart);
        }
        System.out.println(Arrays.toString(arr2)); // [jan-feb-mar-apr-may-jun-jul-aug-sep-oct-nov-dec]
        System.out.println("------------------------------------");
        String [] arr3 = months.split(""); //Split by nothing. Took every character and stored it as an array
        //["j", "a", "n"...]
        for (String eachElem : arr3){
            System.out.print(eachElem);
        }

        System.out.println();
        System.out.println("------------------------------------");
        String [] arr4 = months.split("java");
        for (String each:arr4) {
            System.out.println(each);
        }
        System.out.println(arr4.length); // Nothing to split with "java" all of this becomes 1 element
        // 1
    }
}
