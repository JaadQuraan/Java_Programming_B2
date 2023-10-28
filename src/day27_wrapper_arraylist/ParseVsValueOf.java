package day27_wrapper_arraylist;

public class ParseVsValueOf {

    public static void main(String[] args) {
        String str = "30";

        int num1 =  Integer.parseInt(str); //Converts String -> int primitive data type**
        Integer num2 = Integer.valueOf(str); //converts String --> Integer wrapper class object**

        int num3 = Integer.valueOf(str); //Not recommended. First converting to Integer object //30
        // then unboxing to assign to primitive int
        /*
        First I convert String --> Integer wrapper class object
        Second: Then I convert Integer --> int --> UNBOXING
         */

        Integer num4 = Integer.parseInt(str);
        /*
        First:  I convert the String --> int primitive data type
        Second: I convert int primitive data type--> Integer wrapper class object-> AUTOBOXING
         */

        //Converting String (boolean value) into Wrapper class Object boolean
        String boolValue = "true";
        Boolean isValue = Boolean.valueOf(boolValue);
        System.out.println(isValue);
    }
}
