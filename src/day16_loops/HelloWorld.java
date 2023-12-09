package day16_loops;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("-------------------------------");

        int num = 1; // initial value --> first value given
//        while ( num <=100){
//            num++; //it will still print 101 and on next iteration it will not be correct
//            System.out.println(num + ":Hello World");
        while ( num <=100){
            System.out.println(num + ":Hello World");
            num++;
        }
        System.out.println("-------------------------------");

        int z = 1;

        while (z <= 50){
            System.out.println("Hello Loopcamp: " + z);
            z++;
        }
        /*
        flow of the one above
        z = 1;
        z<=50 --> true--> Go inside body of the while loop, anything between {}
        runs code: from top to bottom
                - print statement -->  Hello Loopcamp: 1
                -post increment --> Incrementing and re-assigning--> z = 2

        z = 2;
        z<=50-->true-->Go inside while loop
         runs code: from top to bottom
                - print statement -->  Hello Loopcamp: 2
                -post increment --> Incrementing and re-assigning--> z = 3
        This will continue until z is z = 51
        51 <= 50 --> false --> it ends the while loop
         */
        System.out.println("-------------------------------");
/*
//        while(true){
//            System.out.println("Loocamp");
//        }
        //Infinite will print nonstop
*/


    }
}
