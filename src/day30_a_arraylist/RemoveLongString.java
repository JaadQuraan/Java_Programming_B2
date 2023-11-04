package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static ArrayList<String> removeLongString (ArrayList<String> list , int maxLength){
        ArrayList <String> updatedList = new ArrayList<>(list);
        updatedList.removeIf(each -> each.length() > maxLength);
         // -> predicate
        return updatedList;
    }
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        System.out.println("Original: "+list);
        System.out.println("After update: " + removeLongString(list, 4));
    }
}
