package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {


        LoopCampStudents student1 = new LoopCampStudents("Sergii",3);
        System.out.println(student1);
        System.out.println("----------------");
        LoopCampStudents student2 = new LoopCampStudents("Nihad",3);
        System.out.println(student2);
        System.out.println("--------------");
        LoopCampStudents.printInfo();
        //This is static belonging to all the students

        System.out.println("Teachers Name: " + Arrays.toString(LoopCampStudents.teachers));
        System.out.println("Teachers Name: " + LoopCampStudents.teachers[0]); // Just prints Nadir

    }
}
