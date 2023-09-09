package day04_variables;
/*
        Task:
            declare and assign 3 variables
            the month number, the day number, and year number

            print the date in the following format:
                month/day/year

     */
public class PrintDate {
    public static void main(String [] args){
        int month = 9;
        int day = 6; //If you start number with 0 it will not be printed in the output
        int year = 2023;
        //int month, day, year;
        System.out.println(month+ "/" +day+ "/" +year);
        System.out.println(month+ "." +day+ "." +year);
        System.out.println(month+ "-" +day+ "-" +year); // - > hyphen or dash
        System.out.println(month+ "|" +day+ "|" +year); //  |  > pipe or vertical bar

    }
}
