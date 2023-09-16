package day07_relational_operators;

public class OperatorPractice2 {
    public static void main(String[] args) {
        int a = 40; //a--> 39, 38, 37, 36, 35, 34
        System.out.println(--a); //pre-decrement --> output : 39
        System.out.println(--a); //output: 38
        System.out.println(a--); //output: 38 | updated value: 37
        System.out.println(--a); //output: 36
        System.out.println(--a); //output: 35
        System.out.println(a--); //output:35 | updated value: 34
        System.out.println(a); //output: 34
    }
}
