package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        short numOne = 40;
        float numTwo = numOne;


        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println();
        float num3 = 100.5F;
        short num4 = (short)num3;
        //need to explicitly cast (short). Narrowing casting

        System.out.println(num3);
        System.out.println(num4);
        System.out.println();
        float num5 = 300;
        byte num6 = (byte)num5;
        short num7 = (short)num5;
        System.out.println(num5); //300.0
        System.out.println(num6); //range -128 --> 127 DATA LOSS
        System.out.println(num7); //300 is in the range of short
        System.out.println();


        char letter = 'A';
        int letterInt = letter;
        System.out.println(letter);
        System.out.println(letterInt); //Prints out ASCII table number

        System.out.println((int)letter);
        System.out.println((char)66); //B can cast in the print statement
        System.out.println();

        int let2 = 66;
        char let3 = (char)let2;
        System.out.println(let3);
        System.out.println();

        System.out.println((int)'&');


    }
}
