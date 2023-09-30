package day14_string;
/*
    .equals(String)
    .equalIgnoreCase(String)
    .length()
    .toUpperCase()
    .toLowerCase
    .startsWith(String)
    .endsWith(String)
 */
public class Contains {
    public static void main(String[] args) {
        String day = "Today it was a Java class";

        System.out.println(day.contains("it was")); //Checks if you have this string anywhere. true
        System.out.println(day.contains("itwas"));//false

        String str = "was a SoftSkills";
        System.out.println(day.contains(str)); //false

        System.out.println(day.contains("Today class.")); //false checks for exact same order
        System.out.println("It was a Java class"); //false
        System.out.println(day.contains(" ")); //true
        System.out.println(day.contains("w"));//true
        System.out.println(day.contains("x"));//false

        System.out.println(day.contains("5")); //false
        System.out.println(day.contains("")); //true anywhere there is an empty string

        System.out.println(day + " Or not"); // "Today it was a Java class"
        System.out.println(day.contains(" Or not.")); //false. never re-assigned in line above
        System.out.println("------------------------");

        System.out.println((day+ " Or not.").contains(" Or not.")); // true () has priority so concatenation has priority
        System.out.println(day.contains(" Or not.")); //false

        if(day.contains("java")){
            System.out.println("There is a coding language name in this sentence");
        } //will NOT be printed

        if(day.contains("Java")){
            System.out.println("There is a coding language name in this sentence");
        } //will be printed

        System.out.println(day.contains("t w")); //true


    }
}
