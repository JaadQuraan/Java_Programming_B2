package day26_methods;
//Create a method that calculates the sum of all numbers up to itself: 3-> 1+2+3 --> 6
public class CountNumbers {

    public static void count (int number){//5
        int sum = 0;
        for (int i = 0; i <= number ; i++) {
            sum += i;

        }
        System.out.println("Total is: " + sum);
    }

    //Can you write the same method to return the sum?
    public static int count2 (int number){
        int sum = 0;
        for (int i = 0; i <= number ; i++) {
            sum += i;

        }
        return sum;
    }

    public static void main(String[] args) {
        count(5);
        count(6);
        count(10);
        count2(5); // 15. Calling method which gives an int but not doing anything with it

        System.out.println("From return type method. Sum is: " + count2(5));
    }
}


