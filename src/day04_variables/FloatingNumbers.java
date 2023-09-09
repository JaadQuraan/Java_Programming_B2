package day04_variables;

public class FloatingNumbers {
    public static void main(String [] args){
/*        System.out.println(num);
          In java you cannot store fractions like this
          */

        float average = 0.4F; //need F or f for float
        double price = 3.99; //For any decimal by default it is

        System.out.println(3/4); //prints 0. It is 0.75 but only takes  the 0 part
        int num1 = 30;
        int num2 = num1;
        //set a condition whenever the first one changes the second will be the same
        System.out.println(num1);
        System.out.println(num2);
    }
}
