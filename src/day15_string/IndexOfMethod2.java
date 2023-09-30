package day15_string;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String str =  "definition";
        //             0123456789
        System.out.println("first i index: "+ str.indexOf("i")); //3
        System.out.println("first i index: "+ str.indexOf('i')); //3
        System.out.println("Last i index: " + str.lastIndexOf("i")); //7
        System.out.println("Last i index: " + str.lastIndexOf('i')); //7
        //You can do it with the character as well
        //How you can find the 2nd i

        System.out.println("Second i index: "+str.indexOf('i',4)); //Find the i start from index 4
        System.out.println("Second i index: "+str.indexOf('i',str.indexOf('i')+1)); //Find the i start from index 4
    }
}
