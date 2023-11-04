package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Given an ArrayList of words switch position for each pair in the List.
    A pair is an element and the element next to it.
    The given ArrayList will always have an even number of elements
    so each element will always have a single pair

    Ex:
    Input:
        {"Cat", "in", "the", "hat"}
    There is two pairs:
    "Cat" and "in"
    "the" and "hat"
    Output:
        {"in", "Cat", "hat", "the”}
 */
public class SwitchPairs {
    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>(Arrays.asList("Cat","in",
                                                                 "the","hat",
                                                                 "apple","water"));
        System.out.println("Before swap: "+ words);
        for (int i = 0; i < words.size(); i+=2) {

//            Collections.swap(words,i,i+1);
            String str = words.get(i);
            words.set(i, words.get(i+1));
            words.set((i+1),str);


        }
        System.out.println("After swap: " + words);
    }
}
