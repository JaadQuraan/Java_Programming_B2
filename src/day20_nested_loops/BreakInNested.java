package day20_nested_loops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("i " + i);
            //break; // if you uncomment here, the code will give an error
            // basically saying any code after this break is not reachable
//
//            if ( i == 3){
//                break; //Here there is possibilities that we will be able to run some code after break statement
//            }
            for (int j = 0; j < 2; j++) {

                System.out.println("j " + j);
                 //Once the break statement is REACHED, it will end the loop which
                // have that break statement directly inside itself
                break;
            }
            //break; // i0 j0 j1 because this belongs to outer loop
        }



    }
}
