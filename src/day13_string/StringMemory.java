package day13_string;

public class StringMemory {
    public static void main(String[] args) {
        int num =4;
        byte num2 = 5;
        char letter = 'f';
        boolean result = true;
        double num3 = 34.5;
        //double num4 =  new double(4) This is not valid cannot do with PRIMITIVE data types
        //Only String is uppercase
        String str = "Hello"; //Creating a String by LITERALS
        String str2 = new String("Hello"); //Creating a String by 'new' keyword

        String zero = "Java"; //pool
        String first = "java";                     //1) String literal--> Stored----> pool
        //These two are different;
        String second = new String("java"); //2) String object(String by new keyboard-->Stored--->NOT in pool, directly in the heap

        String third =  "java";
        String fourth = new String("java");
        System.out.println(first == second); //false
        //When java compares two things it compares if the memory location matches or not. If comparing with literals it is false
        //Location of first java not matching location of second java
        System.out.println(first == third); //true. When made in a literal way. first and third are in the same memory location
        System.out.println(second == fourth); //false
        System.out.println(zero==first);//

        // ==(relational operator) with String compares the memory location
    }
}
