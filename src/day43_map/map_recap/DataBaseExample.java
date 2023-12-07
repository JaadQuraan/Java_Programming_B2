package day43_map.map_recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {

        Map<String,String> personOne = new HashMap();
        personOne.put("FIRST_NAME", "Tom");
        personOne.put("LAST_NAME", "Jerry");
        personOne.put("BATCH_NUMBER", "2");

        Map<String,String> personTwo = new HashMap();

        personTwo.put("FIRST_NAME", "Mickie");
        personTwo.put("LAST_NAME", "Mouse");
        personTwo.put("BATCH_NUMBER", "2");

        System.out.println(personOne);
        System.out.println(personTwo);

        System.out.println("makeMap(\"Winnie\",\"Pooh\",\"2\") = " + makeMap("Winnie", "Pooh", "2"));

        List<Map <String,String> > listOfPeople = new ArrayList<>();
        listOfPeople.add(personOne);
        listOfPeople.add(personTwo);
        listOfPeople.add(makeMap("Winnie", "Pooh", "2"));
        listOfPeople.add(makeMap("Eyad", "Quraan", "2"));
        listOfPeople.add(makeMap("Maya", "Asgarli", "2"));
        listOfPeople.add(makeMap("Zahid", "Musayev", "2"));
        //each of these is a Map in the list


        //Method that accepts 3 parameters(first_name,last_name,batch_number) and returns a Map
        for(Map <String,String> each: listOfPeople){
            System.out.println(each.get("FIRST_NAME"));
        }
        System.out.println("--------------------------");

//        for (int i = 0; i < listOfPeople.size(); i++) {
//            System.out.println(listOfPeople.get(i).get("FIRST_NAME"));
//        }

        //How can you get each Map?
        for(Map <String,String> each: listOfPeople){
            System.out.println(each);
        }
        //Last name of last person in the list
        System.out.println(listOfPeople.get(listOfPeople.size()-1).get("LAST_NAME"));

        System.out.println("---------------------");
        //with e
        for(Map <String,String> each: listOfPeople) {
            if (each.get("LAST_NAME").contains("e")) {
                System.out.println(each.get("LAST_NAME"));
            }
        }


    }
    public static Map makeMap(String first_name, String last_name, String batch_number){
        Map<String,String> person = new HashMap();
        person.put("FIRST_NAME", first_name);
        person.put("LAST_NAME", last_name);
        person.put("BATCH_NUMBER", batch_number);

        return person;
    }





    //Overloaded of makeMap method used Object datatype as the value side
//    public static Map makeMap(String first_name, String last_name, Integer batch_number){
//        Map<String,Object> person = new HashMap();
//        person.put("FIRST_NAME", first_name);
//        person.put("LAST_NAME", last_name);
//        person.put("BATCH_NUMBER", batch_number);
//
//        return person;
//    }
}
