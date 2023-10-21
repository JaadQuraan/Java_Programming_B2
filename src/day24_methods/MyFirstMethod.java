package day24_methods;

import java.util.Arrays;

public class MyFirstMethod {

    public static void helloWorld50(){
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello World");
        }
    }
    public static void helloWorld () {
        System.out.println("Hello World!");
    }

//    public static void helloWorld (){
// In the same class we can NOT have two same method names and exact same parenthesis
//    }


    public static void main(String[] args) {
        helloWorld();
        helloWorld();
        System.out.println("---------------------------------");

        helloWorld50(); // I am calling the method with its name
        helloWorld50();

        //Arrays.sort();
        String str = "hello";
        str.split(""); //does not have static
    }

}
