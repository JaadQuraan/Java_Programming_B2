package day28_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList <String>  list =  new ArrayList<>();
        System.out.println(list.size());

        list.add("computer");
        list.add("screen");
        list.add("mouse");
        list.add("keyboard");
        list.add("desk");
        System.out.println(list);
       String str = list.remove(0); //remove(index); remove it in given index and returns the REMOVED element
        System.out.println(str);
        System.out.println(list);

        //Boolean b1 = list.remove("mouse"); //both of these work. Autoboxing happens
        boolean b1 = list.remove("mouse"); //remove(Object); removes it at first match. If there is a match
        //it returns true, if not it returns false
        System.out.println(b1); //true
        System.out.println(list); //[screen, keyboard, desk]


    }
}
