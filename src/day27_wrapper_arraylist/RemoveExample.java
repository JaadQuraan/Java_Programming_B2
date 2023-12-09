package day27_wrapper_arraylist;
/*
    .add(parameter)
    .add(index,parameter)
    .get(index)
    .size()
    .remove(index) -> if finds return true, removes first match if multiple exists
    .remove(parameter)
 */
import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(); //String is a class can use directly
        list.add("water");
        list.add("bread");
        list.add("apple");
        list.add("butter");
        System.out.println(list);

        list.add(1, "cherry");
        System.out.println(list);

        //How can I get the last element in the arraylist
        System.out.println(list.get(list.size()-1)); //butter
        System.out.println("-------------------------------------");

        list.remove(0); //[water, cherry, bread, apple, butter]
        System.out.println(list); //[cherry, bread, apple, butter]

        list.remove(list.size()-1);
        System.out.println(list); //[cherry, bread, apple]

        list.remove("bread");
        System.out.println(list); //[cherry, apple]
        list.remove("banana");
        System.out.println(list); //banana not in list not going to remove anything

        System.out.println(list.remove("apple")); //true
        System.out.println(list);

        list.add("light");
        list.add("light");
        System.out.println(list);

        list.remove("light");//removes the first light
        System.out.println(list);

    }
}
