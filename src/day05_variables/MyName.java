package day05_variables;

public class MyName {
    public static void main (String [] args) {
                /*
            create a class MyName
            create a main method
            create multiple char variables, one for each letter of your name
            print your name
                print each letter in a different line
                print your name in the same line
     */
        char first = 'J';
        char second = 'a';
        char three = 'a';
        char four = 'd';
        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(four);
        System.out.println(first + second + three + four);
        System.out.println("My name is: "+ first + second + three + four);


        String myName = "" + first + second + three + four;
        System.out.println("My name is: "+ myName);
    }
}
