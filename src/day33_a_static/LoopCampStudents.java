package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class LoopCampStudents {

    String name;
    int groupNumber;
    static int batchNumber;
    static String [] teachers;
    static String schoolName;

    static {
        batchNumber = 2;
//        teachers[0] = "Nadir";
//        teachers [1] = "Feyruz";
        teachers = new  String [] {"Nadir","Feyruz"};
        schoolName = "Loopcamp";
        printInfo(); //put static method in static block
    }


    public static void printInfo(){
        System.out.println("School Info: ");
        System.out.println("\tSchool Name: " + schoolName);
       // System.out.println("Student Name: " + name); NO
        //Cannot use instance in static method
        System.out.println("\tBatch Number: " + batchNumber);
        System.out.println("\tTeachers: " + Arrays.toString(teachers));
        //Arrays toString() is static method. Called w/Class name

    }

    public  LoopCampStudents(String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "LoopCamp Student Info" +
                "\n\tName: " + name +
                "\n\tGroup Number: " + groupNumber +
                "\n\tBatch Number: " + batchNumber;
    }
}
