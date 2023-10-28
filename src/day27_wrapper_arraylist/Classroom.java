package day27_wrapper_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {


        ArrayList <String> group = new ArrayList<>(); //Declared an ArrayList
        System.out.println(group.size());
        group.add("Ulvi");
        group.add("Iryna");
        group.add("Majd");
        group.add("Oleksandr");
        group.add("Ievgeniia");
        group.add("Aslan");

        System.out.println(group);
        System.out.println(group.size());

        System.out.println("First name: " + group.get(0));
        System.out.println("Second name: " + group.get(1));
        System.out.println("Third name: " + group.get(2));
        System.out.println("Fourth name: " + group.get(3));
        System.out.println("Fifth name: " + group.get(4));
        System.out.println("Sixth name: " + group.get(5));
       // System.out.println("First name: " + group.get(6)); Index outofbound exception
        System.out.println();

        //With traditional loop
        for (int i = 0; i < group.size(); i++) {
            System.out.println( (i+1) + " name: " + group.get(i)  );
        }
        System.out.println();
        //With foreach loop
        for (String eachElem: group) {
            System.out.println("Name: " + eachElem);
        }
        System.out.println();

        //Get each character
        for (String each: group){
            for (int i = 0; i < each.length(); i++) {
                System.out.println("Each Character: " + each.charAt(i));
            }
            System.out.println("----------------------------");
        }

    }
}
