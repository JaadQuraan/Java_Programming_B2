package day18_loops;
/*
input: abcabcd
output: abcd
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        
        String original = "abcabcd";
        String unique = "";


            /*
            loop to get each character
            put that character into another container if that character does not have it
             */
            for (int i = 0; i < original.length(); i++) {
                if(!unique.contains("" + original.charAt(i))){
                    unique += original.charAt(i);
                }

            }



        System.out.println("With duplicates: " + original);
        System.out.println("With NO duplicates: " + unique);
        
        
        
    }
}
