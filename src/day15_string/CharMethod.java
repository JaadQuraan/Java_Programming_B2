package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String s = "java";
        //          0123   ----> indexes in String start from zero ( 0 )

        System.out.println(s.length()); //  4 --> number of total characters

        System.out.println(s.charAt(0)); // j  --> datatype will be char
        System.out.println(s.charAt(1)); // a  --> datatype will be char
        System.out.println(s.charAt(2)); // v  --> datatype will be char
        System.out.println(s.charAt(3)); // a  --> datatype will be char
       // System.out.println(s.charAt(4)); //There is no index 4. RUN TIME EXCEPTION
        //System.out.println(s.charAt("4")); //Accepts only number - Compile time exception (ERRORS).
        //Once you read an exception code stops running

        System.out.println("Hello");
        System.out.println("---------------------------");

        String s1 = "cake";
        //           0123 indexes
        // length ---> 4

        String s2 = "apples";
        //           012345 indexes
        // length ---> 6

        String s3 = "softskill";
        //           012345678 indexes
        // length ---> 9

        //How can you get the last character ---> .charAt(index)

        System.out.println(s1.charAt(3));
        System.out.println(s1.charAt(s1.length() - 1));

        System.out.println(s2.charAt(5));
        System.out.println(s2.charAt(s2.length() - 1));

        System.out.println(s3.charAt(8));
        System.out.println(s3.charAt(s3.length() - 1));

        String s4 = "loopcampiouvloopcamp";
        //           01234567
        int lastIndex = s4.length() - 1; //dynamically
        System.out.println(s4.charAt(lastIndex));

        int secondToLastIndex = s4.length() - 2;
        System.out.println("Second to the last character is: " + s4.charAt(secondToLastIndex));

    }
}
