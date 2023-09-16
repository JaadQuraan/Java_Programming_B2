package day09_a__scanner;
import java.util.Scanner;

/*
Enter 3 angle numbers
Determine if angles make a triangle add up to 180
determine if angles make a circle-> add up to 360
 */
public class Angles {
    public static void main (String [] args){
        System.out.println("Enter three angle degree/number: ");
        Scanner input = new Scanner(System.in);
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();
        double total = angle1+angle2+angle3;
        boolean isTriangle = total   == 180;
        boolean isCircle =   total   == 360;
        System.out.println("Is it a triangle? " +isTriangle);
        System.out.println("Is it a circle? "+isCircle);

    }
}
