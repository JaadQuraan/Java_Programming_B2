package day16_loops;

public class Factorial {
    public static void main(String[] args) {
        //Find factorial of 5! -- > 5*4*3*2*1
        //Need to multiply it until reach 1

        int num = 5;
        int result = 1;
        while(num >= 1){
            System.out.println("Result so far: " + result + " * " + num);
            result *=num;
            System.out.println(" = "+result);
            num--;
        }

        System.out.println("Result = " + result);

    }
}
