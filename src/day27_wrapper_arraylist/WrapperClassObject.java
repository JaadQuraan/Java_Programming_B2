package day27_wrapper_arraylist;

import java.util.Scanner;

public class WrapperClassObject {
    public static void main(String[] args) {

        int a = 5;
        //We can assign a new value / reassign it
        // a.method() --- ? we CANNOT do this



        Scanner input = new Scanner(System.in); //Input is a object reference
        Integer a1 = new Integer(10); //This will make it in object directly --> DEPRECATED (NOT IN USE)
        //How can I convert this primitive datatype into an object type

        Integer a2 = 20; //a2 is an object reference
        //Every whole numbers in Java is int
        //Line 18 takes the into 20 and AUTOBOXES it into Integer Wrapper Class

        //The below example is to explain same logic behind casting which is similar
        //double d =10;
        //.out.println(d); // 10.0

        int a3 =a2; //UNBOXING - Converting Integer into int

        byte b = 4;
        Byte b1= b; //AUTOBOXING Now I have object version of the 4 above
        Byte b2 = 20; //AUTOBOXING

        //Both happen automatically. Wrapper class object takes more memory space
    }
}
