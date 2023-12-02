package day42_maps.map_intro;

import java.util.HashMap;
import java.util.Map;

public class Classroom {
    public static void main(String[] args) {
        Map<Integer, Student> map = new HashMap<>();
        Student studentOne = new Student("Tom",25,234);
        map.put(1,studentOne);


        System.out.println(map.get(1));
        map.put(2, new Student("Mickie",26,556));
        System.out.println(map.get(2));

        map.put(3, new Student("Winnie",30,999));
        map.put(4, new Student("James",45,777));
        System.out.println("------------------");
        System.out.println(map);

        //How can I get name paired with KEY 3

        System.out.println(map.get(3).name);
        System.out.println();

        //Looping through map
        System.out.println(map.keySet()); //Only returns the keys [1,2,3,4]
        //KEYS are only unique no duplicates
        //Set interface is also uniques

        for(Integer each: map.keySet()){
            System.out.println("KEY: " + each);
            System.out.println("VALUE: "+ map.get(each));
        }
        //Can you loop through the map and find me the student who's is 777
        System.out.println("-----------------");
        for(Integer each: map.keySet()){
            if(map.get(each).id == 777){
                System.out.println(map.get(each));
            }
        }

        //Can you loop through the map and find me the student who's is 777
        System.out.println("-----------------");
        System.out.println(map.values()); //Return values
        System.out.println("-----------------");
        for(Student each : map.values()){
            if(each.id == 777){
                System.out.println(each);
            }
        }
        System.out.println("-----------------");
        //Another way to loop through MAP
       for(Map.Entry<Integer,Student> each  :map.entrySet() ){
           System.out.println("Each KEY: " + each.getKey());
           System.out.println("Each VALUE: " + each.getValue());
       }

    }
}
