package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String str = "pen";

        System.out.println(str.indexOf("p")); //finding the index from the character
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("n"));


        System.out.println(str.indexOf("x")); // -1  The letter you are providing is not in this String
        //The following 2 if statements will do the same thing.
        if (str.indexOf("x") == -1){
            System.out.println("x is not in the word");
        }

        if (!str.contains("x")){ //usually done this way
            System.out.println("x is not in the word");
        }

        System.out.println("-------------------");

        String str2 = "pencpil";
        //             0123456
        System.out.println(str2.indexOf("p")); // 0 It will look for the p and will return the index of the FIRST match

        str2 = "emcpil";
        System.out.println(str2.indexOf("p")); // 3

        System.out.println("-------------------");
        String str3 =  "loopcamp";
        //              01234567
        System.out.println(str3.indexOf("pc")); //3 because the first Match p is index 3
        System.out.println(str3.indexOf("camp")); //4
        System.out.println(str3.indexOf("camping")); // -1 camping is not in str3
        System.out.println(str3.indexOf("loo")); //0
        System.out.println(str3.indexOf("look")); //-1
    }
}
