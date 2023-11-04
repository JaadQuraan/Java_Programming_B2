package day30_b_custom_classes;

import my_utilities.ArrayUtil;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPeople {
    public static void main(String[] args) {
        //These are NOT VALID ways to reach the INSTANCE VARIABLES
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(Person.name);
//        System.out.println(Person.age);

        //The next 3 lines are just samples of object creation
        Scanner input = new Scanner(System.in);
        Integer [] arr = new Integer[4];
        ArrayList<Integer> nums = new ArrayList<>();

        //Object of the whole person class
        //Every object has its copy of instance variables
        //How I am creating an object of person class
        Person personOne = new Person();
        Person personTwo = new Person();

        System.out.println("Person One Name: "+personOne.name);
        personOne.name = "Majd";
        System.out.println("Person One Name: "+personOne.name);
        personOne.age = 29;
        personOne.height = 5.9;
        personOne.isMarried = true;
        System.out.println("Person One age: "+personOne.age);
        System.out.println("Person One Height: "+personOne.height);
        System.out.println("Person One is Married: " + personOne.isMarried);
        System.out.println("---------------------------------");
        System.out.println("Person Two Name: "+personTwo.name);
        personTwo.name = "Sofia";
        System.out.println("Person Two Name: "+personTwo.name);
        personTwo.age = 27;
        personTwo.height = 5.7;
        personTwo.isMarried = false;
        System.out.println("Person Two age: "+personTwo.age);
        System.out.println("Person Two Height: "+personTwo.height);
        System.out.println("Person Two is Married: " + personTwo.isMarried);

    //    System.out.println(personOne.gender);

        //Imported because it is in different package
        System.out.println(StringUtil.reverse("hello"));

    }
}
