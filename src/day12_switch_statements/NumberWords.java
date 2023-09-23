package day12_switch_statements;

public class NumberWords {
    public static void main(String[] args) {

        int n = 2;

        //else-if statement --> Number must be between 1 and 5 (inclusive)
        if(n==1){
            System.out.println("One");
        } else if (n == 2) {
            System.out.println("Two");
        }else if (n == 3) {
            System.out.println("Three");
        } else if (n == 4) {
            System.out.println("Four");
        } else if (n == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid number");
        }

        System.out.println("------------------------------");

        //Switch statement
        switch(n){
//            case 1: // in if statement ---> if (n == 1)
//                System.out.println("One");
//                break;
            case 1: // in if statement ---> if (n == 1)
                System.out.println("One");
                break;
            case 2: //Exact values cannot be duplicated - this will give compile error
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("===================================");

        //Does not care about order of the cases or default if ALL have the break; statement
        switch(n){
//            case 1: // in if statement ---> if (n == 1)
//                System.out.println("One");
//                break;
            case 2:
            case 3:
                System.out.println("Number is equal to 2 or 3");
            case 5:
                System.out.println("Five");
            default:
                System.out.println("Invalid number");
            case 4:
                System.out.println("Four");



                //Start from matching and continue until break
        }
}}
