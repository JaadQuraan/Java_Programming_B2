package day19_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num =  10;
        //outer loop
        for (int i = 1; i <= 10; i++) {
            //inner loop
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }
}
