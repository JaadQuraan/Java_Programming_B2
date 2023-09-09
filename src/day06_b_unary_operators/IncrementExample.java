package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x); //0
        System.out.println();
        x = x+1; //take value x which is 0 and add 1
        System.out.println(x);

        //In Java there is a shorter way to write x+1 in two options POST-increment and PRE-increment
        //POST-increment
        x++; //increment value by 1
        System.out.println(x); //2

        x++;
        System.out.println(x); //3
        //PRE-increment

        ++x;
        System.out.println(x); //3+1=4
        System.out.println();

        //Q: What is the difference? Why do we have 2?
        System.out.println(++x); // 5. PRE-INCREMENT-It will update x first then print
        System.out.println(x++); // POST-INCREMENT still 5. it prints first then update x


        x = x+1;
        System.out.println(x+1); //System.out.println(++x +1)

        System.out.println(x + 1); //System.out.println(x++ +1)
        x=x+1;


    }
}
