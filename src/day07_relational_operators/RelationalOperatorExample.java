package day07_relational_operators;

public class RelationalOperatorExample {
    public static void main(String[] args) {
        System.out.println(10 > 5); //true
        System.out.println(10 < 5); //false

        int a = 5;
        int b = 3;
        boolean result1 = a>b;
        System.out.println(result1); // true
        System.out.println(a < b); // false

        System.out.println(6 >=6); //true
        System.out.println(10 == 10); //true == means equal
        System.out.println(12 != 12); //false != means not equal
        System.out.println(a == b); //false
        System.out.println('f' == 'g'); // false - here we are comparing ascii table numbers of the characters
        System.out.println('f' == 'f'); //true
        System.out.println('f');
        // = is the assignment operator. == is the equal to
    }
}
