package day44_map_and_functions.string_builder_buffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {
        String str1 = "loopcamp";                            //Stored in String pool in Heap
        String str2 = new String("original");         //Stored directly in Heap
        str1 = str1 + " course";                 //immutable - we cannot change --> here we make a new String

        //2. StringBuilder Class
        // It is in java.lang package
        //MUTABLE - once obj is created we can change it
        //It is NOT synchronized- not threadsafe- can be used by multiple threads at the same time
        StringBuilder str3 = new StringBuilder("loopcamp"); //Stored directly in Heap
        //Stringbuilder is mutable
        //Can only be created with new keyword
        //Has append methods
        System.out.println(str3);
        str3.append(" course");
        System.out.println(str3);
        str3.append(2);
        System.out.println(str3); //loopcamp course2


        System.out.println();
        //3. Stringbuffer class
        //java.lang package
        //MUTABLE
        // It is Synchronized
        StringBuffer str4 = new StringBuffer("loopcamp");
        System.out.println(str4);
        str4.reverse();
        System.out.println(str4);
    }
}
