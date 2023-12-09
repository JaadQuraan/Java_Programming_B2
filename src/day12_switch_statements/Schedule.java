package day12_switch_statements;

import java.util.Scanner;

/*
 Task:

    Ask the user to enter which day it is
    print which class we have on that day, and the time of the class

    topic with instructor at time

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code

 */
public class Schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day of the week is it and what is it about?");
        String day = input.next(); //next is enough because each day of the week is only one word
        String result = "";

        switch (day){

            case "Monday":
                result = "No classes for now but it will soon start.\nIt will be mentor sessions from 7pm-10pm EST. ";
                break;
            case "Tuesday":
                result = "No classes. Do Java homework";
                break;
            case "Wednesday": case "wed": case "WEDNESDAY":
            case "Thursday": case "Thu": case "THURSDAY":
            case "Saturday": case "Sat": case "SATURDAY":
                result = "We are having Java classes with Feyruz";
                break;
            case "Friday":
                result = "No classes but get ready for Saturday long hours";
                break;
            case "Sunday":
            case "SUnday, Sunday, SUn": // This will only match if you provide entire string
                result = "Kind of no class day. But still important";
                break;
            default:
                result = "Not a valid day of the week";
                break;


        }
        System.out.println(result);

    }
}
