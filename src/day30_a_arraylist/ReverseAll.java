package day30_a_arraylist;
/*
        Reverse All
    Create a method that will take an ArrayList of Strings and reverse each element and return an ArrayList of all reversed words
    @param words - Given ArrayList of Strings @return - ArrayList of Strings
    Ex:
    Input: {"ted", "talk", "learn"}
    Output: {"det", "klat", "nrael"}
 */
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));

        System.out.println(list);
        System.out.println(reversAll(list));
    }

    public static ArrayList<String> reversAll(ArrayList<String> list) {

        ArrayList<String> reversedList = new ArrayList<>();

        for (String each : list) {

            String reversed = StringUtil.reverse(each);
//            String str = "";
//            for (int i = each.length()-1; i >=0; i--) {
//                str += each.charAt(i); //d+e+t
//            }
//            reversedList.add(str);
//        }
            reversedList.add(StringUtil.reverse(each));


        }
        return reversedList;
    }
}

