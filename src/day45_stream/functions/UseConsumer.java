package day45_stream.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {
        Consumer <Integer> printToN = n -> {
            for (int i = 0; i <= n; i++) {
                System.out.print(i + " ");
            }
        };


        //Since I am calling that Functional Interface Reference from SAME class
        // I DO NOT need to use class name to call
        printToN.accept(5);
        List <String> list = new ArrayList<>
            (Arrays.asList("Hello","Winter","Holiday","Season"));
        list.forEach(each -> System.out.println(each));

//        list.forEach(each -> System.out.println(each.charAt(0) + " " + each.charAt(each.charAt(each.length()-1)))
//        list.forEach(each -> {
//            if (list.indexOf(each) == 0 || list.indexOf(each) == list.size() - 1)
//                System.out.println(each.charAt(0) + " " + each.charAt(each.charAt(each.length() - 1)));
//         }));
        //Print all the words which is 6 or more letters
        list.forEach(each -> {
        if (each.length() >= 6){
            System.out.println(each);
        }
        });
    }
}
