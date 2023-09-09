package day06_a_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {
        //both of them is int--> int and int --> int
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println();
        //One side is double and another side is int --> double and int --> double
        System.out.println(10.0/5);
        //both sides double result is double
        System.out.println(10.0 / 5.0);
        System.out.println();
        System.out.println(10.0 / 5);
        System.out.println();
        System.out.println((int)10.0 / 5);
        //casted number. int and int --> int = 2

        System.out.println((double)10 / 5);
        //cased double result 2.0
        System.out.println();

        byte b1 = 10;
        byte b2 = 20;
        //byte sum = b1 + b2; //Anything with this calculation becomes int have to cast to byte
        int sum = b1 + b2;
        byte sumByte = (byte)(b1 + b2);
        System.out.println(sum);
        System.out.println(sumByte);

        //Anything byte and short in the calculation automatically gets converted to int





    }
}
