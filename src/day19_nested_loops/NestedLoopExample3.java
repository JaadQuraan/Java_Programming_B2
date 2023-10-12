package day19_nested_loops;

public class NestedLoopExample3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("A" + i);

            for (int j = 0; j < i; j++) {
                System.out.print("B" + j);
            }
        }
    }
}
