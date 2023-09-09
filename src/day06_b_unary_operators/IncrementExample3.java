package day06_b_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {
        int i = 5;
        int z = i++; //z = 5  |  i = 6

        System.out.println(z); //post increment, assigning value and then updating i

        System.out.println(i);
        System.out.println();
        int a = 10;
        int b = a+ 1;
        System.out.println(a); //10
        System.out.println(b); //11

        int c = ++a; // a= a + 1 a =11
        System.out.println(c);
        System.out.println(a);
    }
}
