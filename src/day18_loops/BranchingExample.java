package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            System.out.print(i +" ");
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {

            System.out.print(i +" ");
            break;
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {

            System.out.print(i + " ");
            if (i == 5) {
                //System.out.println("Hello"); This before break would be printed
                break;
            }
        }
            System.out.println();
            for (int i = 0; i <= 10; i++) {


                if(i == 5){
                    break;
                }
                System.out.print(i +" ");
        }

        System.out.println("\n----------------------------");

        for (int i = 0; i <= 10; i++) {


            if(i == 5){
                continue; //Skip whatever is after and directly go and update i to the next cycle
            }
            System.out.print(i +" ");
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {


            if(i % 2 == 1){// Prints even
                continue; //Skip whatever is after and directly go and update i to the next cycle
            }
            System.out.print(i +" ");
        }

        System.out.println();
        for (int i = 0; i <= 10; i++) {


            if(i % 2 == 0){// Prints odd because it will skip evens since i % 2 ==0 is true
                continue; //Skip whatever is after and directly go and update i to the next cycle
            }
            System.out.print(i +" ");
        }

    }
}
