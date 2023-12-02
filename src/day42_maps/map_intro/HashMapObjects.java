package day42_maps.map_intro;

import day38_a_abstraction_interface.interface_methods.MacbbokPro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapObjects {
    public static void main(String[] args) {
       // ArrayList<String> list = new ArrayList<>();
        //Can be any non primitive data type
        //key is ___ Integer and value is ___Integer
        Map<Integer,Integer> map = new HashMap<>(); //Only works with 2 datatypes, KEY, VALUE
        map.put(1,1); //adding values
        map.put(2,400);
        System.out.println(map);
        //key is _ Integer __  and value is _ String __

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(1,"one");
        map2.put(3,"three");
        map2.put(10,"ten");
        map2.put(5,"five");
        //map2.put(-2,"two");
        //map2.put(null,"hello");
        System.out.println(map2);
        //Hashmap order does not keep insertion order. It is RANDOM(Not sorted either)

        //How do we read key/value from Map
        System.out.println(map2.get(10)); //10 is not the index --> it is the object 10 which is the KEY
        String value = map2.get(5); //five
        System.out.println(map2.remove(1)); //remove(KEY) removes the PAIR with the matching KEY, Also returns the removed value
        System.out.println(map2);
        //Check if given KEY is among KEYS
        System.out.println(map2.containsKey(1)); //false
        System.out.println(map2.containsKey(3)); //true
        System.out.println();
        //Check if contains given value
        System.out.println(map2.containsValue("five")); //true
        System.out.println(map2.containsValue("Five")); //false
        System.out.println(map2.containsValue("one")); //false

        map2.put(null,null);
        System.out.println(map2);
        map2.put(null,"Hello World!");
        System.out.println(map2); //Map KEYS do not allow duplicates
        //If you provide already existing KEY, the new VALUE will be assigned to the existing key
        //Existing KEY's VALUE gets updated

        map2.put(5,"May");
        System.out.println(map2);
    }
}
