package day18_loops;

public class CountChars {
    /*
    input: 2juMp
    output:
        1 uppercase
        3 lowercase
        1 number
     */
    public static void main(String[] args) {
        /*
        Loop through all the characters
            -if character is uppercase --> increase count for uppercase
            -if character is lowercase --> increase count for lowercase
            -if character is number --> increase count for number
         */

        String str = "3hY74dgTWShsdHhgTGS!!!";
        int countUpper = 0; // If character -- eachLetter >= 'A' && eachLetter <= 'Z'
        int countLower = 0; //
        int countNum = 0;
        int countSpecial =  0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i); //Get the character at the index number i
            if(eachLetter >= 'A' && eachLetter <= 'Z'){
                countUpper++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                countLower++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                countNum++;
            } else{
                countSpecial++; }
        }
        System.out.println("The number of uppercase letters is: " +  countUpper);
        System.out.println("The number of lowercase letters is: " +  countLower);
        System.out.println("The number of numbers is: " +  countNum);
        System.out.println("The number of special characters is: " +  countSpecial);

        System.out.println("-----------------------");
        int countUpper2 = 0; // If character -- eachLetter >= 'A' && eachLetter <= 'Z'
        int countLower2 = 0; //
        int countNum2 = 0;
        int countSpecial2 =  0;
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i); //Get the character at the index number i
            if (Character.isUpperCase(str.charAt(i))) {
                countUpper2++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                countLower2++;
            } else if (Character.isDigit(str.charAt(i))) {
                countNum2++;
            } else {
                countSpecial2++;
            }
        }
            System.out.println("The number of uppercase letters is: " +  countUpper2);
            System.out.println("The number of lowercase letters is: " +  countLower2);
            System.out.println("The number of numbers is: " +  countNum2);
            System.out.println("The number of special characters is: " +  countSpecial2);



    }
}
