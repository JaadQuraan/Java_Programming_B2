package day21_arrays;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPhone"};
        boolean hasJacket = false;
        //Do we have a Jacket in the store?
        //Here we just did simple String method chaining and check if it contains
        System.out.println(Arrays.toString(items).toLowerCase().contains("jackets"));
        System.out.println("---------------------------------");
        //With loop
        for(String each : items){
            if(each.equalsIgnoreCase("jackets")){
                hasJacket = true;
                break;
            }
        }
            if(hasJacket) {
                System.out.println("We have it");
            }  else {
                System.out.println("We do not have it");
            }

        System.out.println(hasJacket ? "We have it" : "We do not have it");

        System.out.println(Arrays.toString(items).toLowerCase().contains("jackets") ? "We have it" : "We do not have it");


        //Ask a user how many items are in stock (arraysize)
        //Then store those item names into a string array by asking items name to the user
        //Then ask a user which item they are looking for
        //If it exists, print  --> item is in stock
        //If not, print --> item is not in stock

    }
}
