package day22_arrays;
/*
            [IQ] Longest Palindrome
                Given a String array. Find the longest Palindrome String in your array.
                Ex:
                Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
                Output: racecar
                Ex:
                Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
                Output: No palindrome

 */
public class LongestPalindrome {
    public static void main(String[] args) {

        String [] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome = "";

        //I need to loop through to get each of them
        for (int i = 0; i < arr.length; i++) { //With this outer loop I am getting each element of the array
            String eachWord = arr[i]; //Assigning values of specific index of array to String each word
            String reversed = ""; // On each cycle, I am declaring a new String reversed
            for (int j = eachWord.length() - 1; j >= 0; j--) { //On each Outer loop cycle crating a new loop
                                                                //With this inner loop cycle,I am getting each character of eachWord starting from the end
                                                                //And adding each character into this String reversed
                reversed += "" + eachWord.charAt(j);
            }

            if(eachWord.equals(reversed)){ // civic <-> civic  //On each cycle of outer loop, I am comparing if eachWord is equal to the reversed to see if it is palindrome
                if(eachWord.length() > longestPalindrome.length()) { // IF it is palindrome I am comparing the length of the longestPalindrome with the eachWord
                    longestPalindrome = eachWord; // If eachWord length is bigger than reassign then re-assign to the longest palindrome
                }
            }

        }

        System.out.println(longestPalindrome);
    }
}
