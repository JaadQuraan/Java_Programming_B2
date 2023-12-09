package day24_methods;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {


        String [][] groups = new String[4][]; // in first [] declaring how many single arrays will have
        //Do not need to fill out second but can
        //String [][] groups2 = new String[4][3];
        //[ [null,null,null], [null,null,null], [null,null,null], [null,null,null] ]
        System.out.println(Arrays.deepToString(groups));
        System.out.println();

        String [] group1 = {"Gular", "Maya", "Parvana"};
        groups[0] = group1;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 2 .........");
        String [] group2 = {"Iryna", "Aytaj", "Elturk", "Anna"};
        groups[1] = group2;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 3 .........");
        String [] group3 = {"Ramiz", "Natalia"};
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 4 .........");
        String [] group4 = {"Ulvi"};
        groups[3] =  group4;
        System.out.println(Arrays.deepToString(groups));
        System.out.println("----------------------------------");

        for (String [] eachElement: groups) {
            System.out.println(Arrays.toString(eachElement));
        }
        //With traditional loop
//        for (int i = 0; i < groups.length; i++) {
//            System.out.println(Arrays.toString(groups[i]));
//        }

        System.out.println("----------------------------------");

        for (String [] eachArray : groups) {
            for (String eachElement: eachArray) {
                System.out.println(eachElement);
            }
        }

    }
}
