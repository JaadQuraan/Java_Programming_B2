package day22_arrays;

import java.util.Arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        String str = "Java always fun";
        String words [] = str.split(" ");
        System.out.println(words[1]); //always

        String midReverse = "";
        for (int i = words[1].length() - 1; i >=0 ; i--) {
            midReverse += words[1].charAt(i);
        }
        System.out.println(midReverse);
        words[1] =  midReverse;
        System.out.println(Arrays.toString(words));

        System.out.println(words [0] + " " + midReverse + " " + words[2]);
    }
}
