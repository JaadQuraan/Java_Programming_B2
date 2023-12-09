package day27_wrapper_arraylist;
/*
    sef23LENF#$234sdf
    //Find which is number, uppercase,  lowercase
 */
public class CountCharacters {
    public static void main(String[] args) {
        String str = "sef23LENF#$234sdf";
        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;
        int otherCount = 0;
        //arr.length NO ()
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if(Character.isUpperCase(eachLetter)){
                upperCount++;
            } else if(Character.isLowerCase(eachLetter)){
                lowerCount++;
            } else if(Character.isDigit(eachLetter)){
                digitCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println(upperCount);
        System.out.println(lowerCount);
        System.out.println(digitCount);
        System.out.println(otherCount);
    }
}
