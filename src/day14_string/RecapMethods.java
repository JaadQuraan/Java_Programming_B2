package day14_string;

public class RecapMethods {
    public static void main(String[] args) {

        String s = "pen"; // s is a string literal. It is in the String pool
        String s2 = new String ("pen"); //s2 is an object in the heap because we used the 'new' keyword

        System.out.println("Compare with == "+ (s == s2)); //  == --> compares the memory location so it will be false
        System.out.println("Compare with .equals(String) "+ (s.equals("pen"))); // Compares the  EXACT values. so it will be true

        System.out.println("Compare with .equals(String) "+ (s.equals("Pen"))); // Compares the EXACT values. so it will be false
        s = "Pen"; // s has a new value "Pen"
        System.out.println("Compare with .equals(String) "+ (s.equals("Pen"))); // Compares the EXACT values. so it will be true

        String ss = "Pen";
        System.out.println("Compare with .equals(String) "+ (s.equals(ss))); // Compares the EXACT values. so it will be true

        s="PEN";
        ss="pen";

        boolean isSame = s.equalsIgnoreCase(ss);
        System.out.println(isSame);

        if(isSame){
            System.out.println("Hello");
        }

        ss="PENN";
        if(s.equalsIgnoreCase(ss)){ //PEN <--->PENN | pen<---> penn
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }
        System.out.println("----------------------------");

        //s ---> PEN
        //ss --> PENN

        System.out.println(s.length()); //No argument  3
        System.out.println(ss.length()); //4
        //.length() returns int.



        int a = s.length(); //3
        int b = ss.length(); //4

        if(s.length() < 4){
            System.out.println("short word");
        } else {
            System.out.println("not short");
        }

        if(a < 4){
            System.out.println("short word");
        }
        System.out.println("aaaaaa".length()); //6
        System.out.println("a    a".length()); //6
        System.out.println("".length()); // 0

    }
}
