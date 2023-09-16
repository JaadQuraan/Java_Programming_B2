package day07_relational_operators;

public class OperatorPractice4 {
    public static void main (String [] args){
        int t = 100; // 101, 100, 101, 100

        //    = -101 * -101  / 100 + 100  ---> 10201 / 100 + 100--> 102+100=202
        int p = - ++t * -t-- / t++ + --t;
        int c = 10201 % 100; // 1
        System.out.println("t: " + t); //100
        System.out.println("p: " + p); //202
        System.out.println("c: " + c);

        /*
        8 % 5 -- > 8-5 = 3
        16 % 5 --> 16-5=11-5=6-5= 1
         */

    }
}
