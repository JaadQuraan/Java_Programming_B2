package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Scanner;
/*
    .add(parameter)
    .get(index)
    .size()
 */
public class ArrayListExample {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        //All collection classes work ONLY with OBJECT data type
        //ArrayList <int> numbers = new ArrayList<>() -> NOT GOOD

        ArrayList <Integer> numbers = new ArrayList<>(); //In the memory, it allocated the size of 10
        System.out.println(numbers.size()); //But with help of .size() method it does not show as 10
        //That much just stays allocated
        //Comparing two ARRAY <> we can directly print the ARRAYLIST
        System.out.println(numbers);

        numbers.add(100);//Converting int into wrapper class object type -> AUTOBOXING
        //How we can add element into Array<>
        //.add(x) -> add element to the END
        System.out.println(numbers);

        numbers.add(-200);
        System.out.println(numbers);//.add(x) -> add element to the END

        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        //how do I get the total of the elements in the ArrayList
        System.out.println(numbers.size()); // This uses ()

        //How do we get the element in the specific index?
        //Similar to array, the arraylist index starts from 0 as well.
        //arr[index]
        System.out.println(numbers.get(0)); // [100, -200, 10, 20] --> 100
        System.out.println(numbers.get(1)); // [100, -200, 10, 20] --> -200
        System.out.println(numbers.get(2)); // [100, -200, 10, 20] --> 10
        System.out.println(numbers.get(3)); // [100, -200, 10, 20] --> 20
        //System.out.println(numbers.get(4)); // [100, -200, 10, 20] --> Index out of bound exception

    }
}
