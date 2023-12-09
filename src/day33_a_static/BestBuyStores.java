package day33_a_static;

import java.util.Scanner;

public class BestBuyStores {
    public static void main(String[] args) {


        BestBuy store1 = new BestBuy("Fairfax");
        BestBuy store2 = new BestBuy("McLean");
        BestBuy store3 = new BestBuy("Falls Church");

        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);
        System.out.println();

        store1.location = "Alexandria";
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println();
        store1.headQuarter = "Texas,US";
        //If the value of static changes it changes for every object
        System.out.println(store1.headQuarter);
        System.out.println(store2.headQuarter);
        System.out.println(store3.headQuarter);

        System.out.println(BestBuy.headQuarter);
//        System.out.println(BestBuy.location);
        //BestBuy.openStore(); cannot use class name for instance methods
        System.out.println();
        store1.openStore();
        store2.openStore();
        store3.openStore();

        store1.countStock(); //not reconmmended to call with object name
        store2.countStock();
        store3.countStock();
        BestBuy.countStock(); //Use class name to call Static methods

        Scanner in = new Scanner(System.in);
        //instance method

    }
}
