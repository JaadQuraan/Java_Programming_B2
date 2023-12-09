package day19_nested_loops;
/**
Java is a language java
Made by: @jaadquraan
 */
public class CountJava {
    public static void main(String[] args) {
        String str = "java is a java language java";
        //            012345....
        //If first four characters match java --> counter++
        //Jump index to after java
        int counter = 0;
        System.out.println(str.length()); //23

        for (int i = 0; i < str.length() - 3; i++) {
                                    //       22,22+4 out of bounds length only 23, have to change condition
            String everyFour = str.substring(i, i + 4); // 4 is not inclusive goes up to that point //java
            // i = 0 --> str.substring(0, 0 + 4)

            if(everyFour.equals("java")){
                counter++;
            }
        }

        System.out.println(counter);


    }
}
