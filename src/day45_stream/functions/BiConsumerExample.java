package day45_stream.functions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, Integer> printNTimes = (str, num) -> {
            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        };

        printNTimes.accept("loop", 4);
        printNTimes.accept("hello", 2);
        System.out.println("------------------------");

        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        //Map is not part of collection hierarchy
        // .keySet() | .values() | .entrySet() to loop through

        // this is another way that we can loop through the MAP and get pair,  or just the key, or just the value depending on your task
        map.forEach(
                (key, value) -> {
                    System.out.println(key + " " + value);
                }
        );
        map.forEach(
                (key, value) -> {
                    System.out.println("Size of of Key String: " + key.length());
                }
        );

//        map.forEach(
//                (key, value) -> {
//                    System.out.println("Size of each key String" + key.length());
//                }
//
//    };
    }
}

