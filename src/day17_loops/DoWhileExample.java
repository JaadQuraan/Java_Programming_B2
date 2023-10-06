package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 1;

        do {
            //Everything between {} are in the loop
            System.out.println(a);
            a++;//2 - 3 - 4.... 10 - 11

        } while(a <= 10); // No matter what condition is here, whole thing will always run at least once


        //This loop has a boolean of 'false', but it still runs through the code body one time because it is a do while loop
        int a2 = 0;

        do {
            System.out.println(a2); // 0
            ++a2; // a2=1
        } while(a2 == 10); // 1 == 10 --> false. It will only run once

        int a3 = 0;

        while (a3 == 10){ //false will not run while loop is run
            System.out.println(a3);
            a3++;
        }

    }
}
