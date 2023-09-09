package day04_variables;

public class Fruits {
    public static void main(String[] args) {

        int apples = 50;
        int grapes = 100;
        int bananas = 150;

        //int apples = 50, grapes = 100, bananas =  Can declare this way also only if you have same data type
        System.out.println("This is how many apples we have " + apples);
        // + ---> plus sign here is not addition
        //It is called concatentation[Kon--- KATI---NEYSHIN]
        System.out.println("Grapes:" + grapes);
        System.out.println("Bananas:" + bananas);
        System.out.println("I sold some apples - 20 apples sold");
        apples= 30;
        System.out.println("Apples after I sold " + apples);

        int price = 150;
        System.out.println("The price of my 30 apple is 150"); //Hardcoded
        System.out.println("The price of my " + apples + " apple is "+ price); //Dynamic

        System.out.println(50); //by default this is int


    }
}



/*
(2a+4a +5a) --> a(2 +4 + 5)
 */