package day08_scanner_logical_operators;

public class AgeGroup {
    /*
        task:

            declare and assign an age variable

            is the person a kid ( up to 13, include 13)

            is the person a senior citizen ( 65 and above)
     */
    public static void main(String[] args) {
        int age = 65; //We have initialized the age variable and assigned a value of 10 to it.


        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;

        System.out.println("You are a kid: " + isKid);
        System.out.println("You are a senior: "+isSenior);

    }
}
