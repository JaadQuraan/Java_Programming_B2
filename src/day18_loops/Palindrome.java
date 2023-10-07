package day18_loops;
//Palindrome word reading same from beginning and same from end
// madam mom anna
public class Palindrome {
    public static void main(String[] args) {
      String original ="anna";         //mom
      String reversed = ""; // avaj    //mom

      //reading from beginning == reading from end
      // reading from beginning ---> original
      // reading from end --- >

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed +=  original.charAt(i);
        }

        System.out.println(original);
        System.out.println(reversed);
        if(original.equals(reversed)){
            System.out.println("The word '" + original + "' is a palindrome");
        } else {
            System.out.println("The word '" + original + "' is not a palindrome");
        }

        System.out.println(original.equals(reversed)  ? "This is palindrome" : "This is not palindrome");



    }
}
