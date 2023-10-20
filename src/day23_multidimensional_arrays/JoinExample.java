package day23_multidimensional_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {

        String [] words = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(words)); // [a, b, c]
        System.out.println();
        String result = "";

        //a-b-c
        for (String eachWord: words) {

            result += eachWord + "-";
        }

        System.out.println(result);
        String result2 =  "";
        for (int i = 0; i < words.length; i++) {

            result2 += words[i];
        if(i == words.length - 1){
            break;
        }
            result2 += "-";
    }
        System.out.println(result2);

        System.out.println("-------------------------------");
        //With .join() method
        System.out.println(String.join("-", words)); //a-b-c-d
        System.out.println(String.join("*", words)); //a*b*c*d
        System.out.println(String.join("", words)); //abcd

        //Take this array and put delimiter between all the elements
        String str2 = String.join("*", words);
        System.out.println(str2);
        System.out.println("-------------------------------");
        char [] arr = {'a', 'b', 'c',  'd'};
        String str = new String(arr);
        System.out.println(str);

        //The following takes anything after first comma as a ONE array
        System.out.println(String.join("*",  words[0], words[2])); //a*c




    }
}
