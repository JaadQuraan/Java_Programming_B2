package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
0 - id
1 - firstName
2- lastName
3- batchNum
 */
public class StudentInformation {
    public static void main(String[] args) {
        String [] studentOne = {"001", "Tom", "Jerry", "Batch#2"};
        System.out.println(Arrays.toString(studentOne));

        String [] studentTwo =  new String[4];
        System.out.println(Arrays.toString(studentTwo));
        studentTwo[0] = "002";
        studentTwo[1] = "Mickey";
        studentTwo[2] = "Mouse";
        studentTwo[3] = "Batch#2";
        //studentTwo[4] =  //Array out of bounds exception
        System.out.println(Arrays.toString(studentTwo));

        Scanner input = new Scanner(System.in);
        String []  studentThree = new String[4];
        System.out.print("Enter id: ");
        studentThree[0] = input.next();  // "003"
        System.out.print("Enter first name: ");
        studentThree[1] = input.next();
        System.out.print("Enter last name: ");
        studentThree[2] = input.next();
        System.out.print("Enter batch number: ");
        studentThree[3] = input.next();

        System.out.println(Arrays.toString(studentThree));
        System.out.println("-----------------------------------");
        String []  studentFour = new String[4];
        String [] questions = {"Enter id: ", "Enter first name: ", "Enter last name: ", "Enter batch number: "};
        //
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            studentFour[i] = input.next();
        }
        System.out.println(Arrays.toString(studentFour));

    }
}
