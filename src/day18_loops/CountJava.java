package day18_loops;

//input: java is a java language.java
//output: 3
public class CountJava {
    public static void main(String[] args) {
        /*
        java is a java language.java
        if contains
            -> count increase by 1
            -> * is a java language.java
            -if contains java -> count increase by 1
            -> is a * language.java....
         */


        String str = "java is a java language.java";
        int count = 0;
        System.out.println(str);
        System.out.println("-------------------");

        while(str.contains("java")) {
            str = str.replaceFirst("java", " ");
            count++;
            System.out.println(str);
        }
        System.out.println();
        System.out.println(str);
        System.out.println(count);

        //replace changes all of them at the same time
        //replace first only changes first one so this will loop  and change each time to increase the count

    }
}
