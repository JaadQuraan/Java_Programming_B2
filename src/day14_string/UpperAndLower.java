package day14_string;

public class UpperAndLower {
    public static void main(String[] args) {
        String str = "LoopCamP";

        System.out.println(str);
        System.out.println(str.toLowerCase());

        str = str.toLowerCase(); //it will make the string value to be in lowercase
        System.out.println(str);

        //Once its made its made, when we use diffeernt methods we are creating a brand new string in the memory
        str = "LoopCamP";
        System.out.println(str.toUpperCase()); //No variable points to this
        System.out.println(str); //Still pointing to LoopCamP
        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("----------------------------------------");

        String word = "HELLO";
        String word2 = word + " WORLD";
        System.out.println(word2);
        System.out.println(word);

        System.out.println(word.toUpperCase());
        System.out.println(word2.toLowerCase());
        System.out.println(word.toLowerCase());

        System.out.println(word2);
        System.out.println(word);

        word2 += " Next Line";
        System.out.println(word2);

        word2 = word2.toLowerCase();
        System.out.println(word2);





    }
}
