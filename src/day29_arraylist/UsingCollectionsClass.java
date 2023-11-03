package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    .add(parameter)
    .add(index, parameter)
    .get(index)
    .remove(index) - > if finds returns Element / And removes the given index if exist
    .remove(parameter) > if finds returns TRUE/FALSE and removes first match if multiple exists
    .size()
    .contains (parameter) - > if the given parameter exists in the Arraylist, it returns true. If not, it returns false
    .isEmpty () - > checks if the ArrayList has elements or not. If it does, it returns FALSE otherwise, it returns TRUE
    .clear() - > It will remove all the elements from the Arraylist and make it empty
    .set ( index, parameter )  - > It will fins the given index and UPDATE the value on that index. If idex is not in the range, it will throw IndexOutOfBoundsException
    .indexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index. If nothing matched, -1 will be returned
    .lastIndexOf(parameter) - > It will return the FIRST MATCHED ELEMENTS index from the END. If nothing matched, -1 will be returned
    Arrays.asList( arr ) - > this will help to either convert the array into arraylist. Or, declare ArrayList with values directly.
    .addAll (Collection) - > Collection - > Arrays.asList(arg) - > All will be added to the end of the list
    .addAll (index, Collection ) - >Collection - > Arrays.asList(arg) - > All will be added starting from the given INDEX
    .removeAll (Collection) - > Collection - > Arrays.asList(arg) - > All will be removed from the list
    .retainAll (Collection) - > Collection - > Arrays.asList(arg) - > All the matching ones will be kept from the list and rest will be removed
    .containsAll (Collection) - > Collection - > Arrays.asList(arg) - >If ALL the Collection exist in the list - return TRUE if not return FALSE

 */
public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 67, 22, 230, 12) );
        System.out.println("Original: " + list);

        //Sort the ArrayList
        Collections.sort(list); //Using class name. It is a static method
        System.out.println("Sorted: " + list);

        //reverse
        Collections.reverse(list);
        System.out.println("Reversed: "  + list);

        ArrayList <Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);


        //MAX and MIN
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        Collections.swap(letters,0,3);
        System.out.println(letters);
        System.out.println("------------------");
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 2, 34, 5, 7, 11));
        System.out.println(Collections.frequency(numbers,11));

        ArrayList <String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "two", "four"));
        //Has to exactly match case sensitive
        System.out.println(Collections.frequency(words, "one"));
        System.out.println(Collections.frequency(words, "two"));
        System.out.println(Collections.frequency(words, "four"));
    }
}
