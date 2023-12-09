package day45_stream.functions;

import java.util.ArrayList;

public class CallPredicateMethods {
    public static void main(String[] args) {

       // new ArrayList<String>().removeIf(each -> each.contains("hi"));
        //Predicate - checking condition and returns boolean
        //Accepts 1 argument

        //Since I am calling that Functional Interface Reference from DIFFERENT class
        // I DO  need to use class name to call
        boolean result = UsePredicate.isPalindrome.test("anna");
        System.out.println(result);
        System.out.println(UsePredicate.isPalindrome.test("hello"));

        System.out.println();
        System.out.println(UsePredicate.isPrime.test(5));
        System.out.println(UsePredicate.isPrime.test(6));
        //Accepts integer because IsPrime accepts Integer
    }
}
