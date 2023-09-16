package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {
        /*
        &&
        -------------------------------
        True && True ---> True
        True && False -> False
        False && True --> False --> If the first part is false, 2nd part I do not care
        False && False --> False  --> If the first part is false, 2nd part I do not care

        System.out.println(false && (a++ > 11)); Right side will never be executed a will not be updated
        System.out.println(false & (a++ > 11));

             ||
        -------------------------------
        False || False ---> False
        True || False -> True
        False || True --> True
        True || True --> True



        *****NOTE
        If we want still execute the second expression (2nd side), instead of &&, || --> we can use &, |
         */

        System.out.println(true || 5/0 == 0);
        //System.out.println(true | 5/0 == 0); still execute 2nd part undefined cannot divide by 0

        System.out.println(false && 5/0 == 0);
        //System.out.println(false & 5/0 == 0); still execute 2nd part undefined cannot divide by 0


    }
}
