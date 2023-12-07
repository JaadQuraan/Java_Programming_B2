package day43_map.map_recap;

import java.util.*;

public class Store {
    public static void main(String[] args) {
        //declare a HashMap with ref Map and ENTRTY will be String, Double. KEY is String. Value is double
        Map<String, Double> store = new HashMap(); //recommend to have datatypes in first <>
        store.put("water", 1.9); //returns every single one as single map
        store.put("coffee", 2.9); //Map<String,Double) map = new <> HashMap()
        store.put("apples", 0.99);
        store.put("bread", 3.99);
        store.put("banana", 1.99);
        //5 keys and 5 values
        System.out.println(store);
        //Using polymorphism to limit access
        //Loop through the store and give me the items

        //price of apple
        System.out.println(store.get("Apples")); //gets value of specific KEY

        //Option 1: With the help of keySet()
        //Set<String> setOfKeys = new HashSet<>(); //needs same datatype of KEYS
        // setOfKeys = store.keySet(); //it will return all the KEYS as a Set
        System.out.println("Store Inventory: ");
        for (String each : store.keySet()) {
            System.out.print("\t" + each);
            System.out.println("\t" + store.get(each));
        }

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = s1;

        //loop through and get the prices for Apples and Water
        System.out.println("-----------------------");
        for (String each : store.keySet()) {
            if (each.equals("Apples") || each.equals("Water")) {
                System.out.println(each);
                System.out.println(store.get(each));
            }
        }
        System.out.println("-------------------------");
        //Option 2: With the help of values() it will return all the values
        for (double each : store.values()) {
            System.out.println("Each price of each item in store: " + each);
        }
        //Option 3: With the help of .entrySet() method -> returns all the ENTRIES
        //Will return a collection of a map

        for (Map.Entry<String,Double> each :store.entrySet()){//Have to use Map.Entry
            System.out.println("Item Name: " + each.getKey()); //this will return the KEY side of the Entry
            System.out.println("Value of: " + each.getKey() + " is $" + each.getValue());

        }
        Map<String,Double> map1 = new HashMap<>();
        map1.put("Apples",0.99);
        Map<String,Double> map2 = new HashMap<>();
        Map<String,Double> map3 = new HashMap<>();

        Map<Integer, Map<String, Double> > allMaps = new HashMap<>();
        allMaps.put(1,map1);
        //KEYS are Integers, Values are single Map

        //Use scanner to ask what item they want to get
        Scanner input = new Scanner(System.in);
        System.out.print("What item do you want to check?");
        String userItem = input.nextLine().toLowerCase();

        //Check if item is in the
        String result = store.containsKey(userItem) ? userItem + " is in stock and price is $" + store.get(userItem) : "Item is not in stock";
        System.out.println(result);
    }
}
