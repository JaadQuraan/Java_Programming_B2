package day26_methods;

import my_utilities.StringUtil; //Importing the StringUtil class from my_utilities package
public class UsingStringUtil {
    public static void main(String[] args) {

        int a = 4;

        System.out.println(StringUtil.frequencyOfCharacters("apple", 'p'));
        //classname.methodname()

        System.out.println(StringUtil.fixFormat("mICkeY"));

        System.out.println(StringUtil.reverse("Loopcamp"));
        System.out.println(StringUtil.isPalindrome("racecar"));
        System.out.println(StringUtil.isPalindrome("loopcamp"));

        System.out.println(StringUtil.uniqueCharacters("apple"));


        System.out.println(StringUtil.frequencyOfCharacters("apple", 'p'));//Coming from StringUtil package

        System.out.println(FrequencyOfCharacters.frequencyOfCharacters("loop", 'o'));
        //This is coming from day26_methods.
        // If the method is in a different package, have to import that package
        //If they are in the same package, I do not need to import that package

    }

}
