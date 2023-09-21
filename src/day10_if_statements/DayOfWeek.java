package day10_if_statements;
/*
Declare and assign number for each day of the week
 */
public class DayOfWeek {
    public static void main(String[] args) {
        int day =8;

        //Once the first true condition is reached the rest will be skipped
        if(day==1){
            System.out.println("Monday");
        } else if (day==2) {
            System.out.println("Tuesday");
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");

        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        } else{
            System.out.println("Not valid number for day");
        }

        System.out.println("==========================================");
        //Since we have multi sinle if statements, no matter of the condition of each if statement, every single one will be checked separately
        if(day==1){
            System.out.println("Monday");
        }


        if (day==2) {
            System.out.println("Tuesday");
        }


        if (day==3) {
            System.out.println("Wednesday");
        }
        if (day==4) {
            System.out.println("Thursday");
        }
        if (day==5) {
            System.out.println("Friday");

        }
        if (day==6) {
            System.out.println("Saturday");
        }
        if (day==7) {
            System.out.println("Sunday");
        }


        //Multiple if else
        System.out.println("=====================================");
        if(day==1){
            System.out.println("Monday");
        }else{
            System.out.println("Not valid number for day");

        }
        if (day==2) {
            System.out.println("Tuesday");
        } else{
            System.out.println("Not valid number for day");

        }
        if (day==3) {
            System.out.println("Wednesday");
        }
        if (day==4) {
            System.out.println("Thursday");
        }
        if (day==5) {
            System.out.println("Friday");

        }
        if (day==6) {
            System.out.println("Saturday");
        }
        if (day==7) {
            System.out.println("Sunday");
        }

    }
}
