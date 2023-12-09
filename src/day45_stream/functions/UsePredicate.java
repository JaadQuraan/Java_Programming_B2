package day45_stream.functions;

import java.util.Arrays;
import java.util.function.Predicate;

public class UsePredicate {

    public static Predicate <String> isPalindrome = (str) -> {
//                                  reference
//        String r = "";
//        for (int i = str.length()-1; i >= 0; i--) {
//            r+=str.charAt(i);
//        }
        //String reversed = new StringBuilder(str).reverse().toString();
//        if(reverse.equals(str)) {return true;}
//        return false;
        return  str.equals(new StringBuilder(str).reverse().toString());
        //implementation
    };

    public static Predicate<Integer> isPrime = number -> {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                count++;
            }
        }
        return count == 2;
    };


}
//    public static void main(String[] args) {
//        String str = new String("Hello");
//        str.length();
//        //Built in method calling with ref
//    }
