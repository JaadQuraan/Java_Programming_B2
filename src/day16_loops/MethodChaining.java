package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {
        String str = "   java   ";
        // I want to remove spaces and I want to make all UPPERCASE
//        str = str.trim();
//        str = str.toUpperCase();

        str =  str.trim().toUpperCase().toLowerCase().substring(0,3);
        //As long as the method returns a String, you can keep chaining
//        str.trim().toUpperCase().toLowerCase().substring(0,3).indexOf("j").substring;
        // Index of returns int can't do the substring after


    }
}
