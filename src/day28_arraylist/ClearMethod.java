package day28_arraylist;

import java.util.ArrayList;
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

 */
public class ClearMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(800);

        System.out.println(nums);
        System.out.println(nums.size()); //5
        System.out.println(nums.isEmpty()); //false

        nums.clear();

        System.out.println(nums);
        System.out.println(nums.size()); //0
        System.out.println(nums.isEmpty()); //true
    }
}
