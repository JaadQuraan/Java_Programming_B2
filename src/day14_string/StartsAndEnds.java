package day14_string;

public class StartsAndEnds {
    public static void main(String[] args) {

        String str = "Apples";
        System.out.println(str.startsWith("App"));  //returns boolean value. true
        System.out.println(str.startsWith("app")); // false

        System.out.println(str.startsWith("Apples")); //true
        System.out.println(str.startsWith("A")); //true

        String str2 = "App";
        System.out.println(str.startsWith(str2)); //true

        System.out.println("------------------------");

        System.out.println(str.startsWith(" App")); //String str = "Apples" false does not start with space
        System.out.println(str.startsWith(       "App")); //String str = "Apples" true does not care about spaces outside ""
        System.out.println("-------------------------------");

        String sentence = "It is a good day";
        System.out.println(sentence.startsWith("a good day")); //false
        System.out.println(sentence.endsWith("a good day")); //true
        System.out.println(sentence.endsWith("day")); // true
        System.out.println(sentence.endsWith(" day")); // true
        System.out.println(sentence.endsWith("d day")); // true
        System.out.println(sentence.endsWith("It is a good day")); // true




    }
}
