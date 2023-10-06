package day17_loops;

public class ForLoopExample {
    public static void main(String[] args) {
        // shortcut: fori
        // 1-initialization; 2-condition 4-iteration
        for (int i = 0;      i < 10;      i++) {
            //3-code body
            System.out.println(i);
            System.out.println("Hello");
            System.out.println("Bye");
            System.out.println("-----------------");
        }
        /*
        For loop execution flow
        1) initialization: the loop executes initialization part which declares itn i and assigns initial value 0
           in our ex: int i = 0;
           Initialization runs ONLY ONCE at the beginning of the for loop

        2) condition: It is boolean expression, boolean condition, termination condition
                - in our ex: i < 10;
                    -if the boolean is TRUE(do number 3): the loop will execute the statements in the body between {}
                    -if boolean is FALSE (do number 5): The loop will stop
        3) The statements in the code body are executed TOP to BOTTOM
                - in our example:
                 System.out.println(i);
                 System.out.println("Hello");
                 System.out.println("Bye");

         4) Iteration: Update happens here. This is like end of each cycle/iteration
                -in our example: i++
                -Go back to number 2

        5) End the loop
         */

        //This will do same as code above
       int z = 1;
       while (z<=10){
           System.out.println(z);
           System.out.println("Hello");
           System.out.println("Bye");
           System.out.println("-----------------");
           z++;
       }

       int k = 1;
       do {
           System.out.println(k);
           System.out.println("Hello");
           System.out.println("Bye");
           System.out.println("-----------------");
           k++;
       }while (k <= 10);


    }
}
