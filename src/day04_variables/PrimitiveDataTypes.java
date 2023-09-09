package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String [] args){
        //int num = 5 //We have a variable called num which is int data type and the number 5 is assigned to it
        byte age = 80; //I declared a variable called age which has byte data type and the number 50 assigned to it
        System.out.println("50"); //Hardcoded
        System.out.println("age"); //Here "age" is not a variable it is a word we are printing
        System.out.println(age); // Dynamically- age is a variable and can change

        //byte age = 95 //In java we cannot declare same variable name more than once
        //byte age2 = 950; //primitive data type byte cannot hold 950 because it is out of the range byte can hold
        age= 100; // since we are not decalring it again it will re-assign the value
        System.out.println(age);

        short year; // In this line we just declared the variable
        year = 2023; // In this line we assigned a value to year variable
        int addressNumber = 234235453;
        long bigNumber;
        bigNumber = 9345345876876876L; //With long syntax is to put L at the end
        //long year; //this  container year has been used. Cannot use same variable more than once in same block of code
    }
}
