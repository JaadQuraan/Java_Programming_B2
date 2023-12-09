package day44_map_and_functions.functional_interface;

import java.util.Collections;

public class UsingDynamicInterface {
    public static void main(String[] args) {

        DynamicInterface <String> printEachChar = (word) -> {// Tells it to accept String for this implementation
            System.out.println();
            for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
            }
        };
        printEachChar.test("Hello Functional Interface");
        System.out.println("-------------------");
        DynamicInterface <Integer> printUpUntil = (num) -> {// Tells it to accept String for this implementation
            for (int i = 1; i < num; i++) {
                System.out.println(i);
            }
        };
        printUpUntil.test(5);

    }
}
//Can have multiple implementations for the same method
//Whatever implementation I call I use that reference