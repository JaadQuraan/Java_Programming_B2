package my_utilities;

public class StringUtil {

    /**
     * This method reverses the given String
     * @return Reversed String
     * @jaadquraan
     */
    public static String reverse (String word){
        String reversed = "";

        for (int i = word.length() - 1; i >= 0 ; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    /**
     * This method is finding how many times given characters appears in a word
     * @return frequency of character
     * @jaadquraan
     */
    public static int frequencyOfCharacters (String word, char letter) {
        int count = 0;

        for (int i = 0; i < word.length(); i++) {

            if ( word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method fixes the format of the given String
     * Making the first letter uppercase and rest in lowercase
     * @return fixed format
     * @jaadquraan
     */
    public static String fixFormat (String name){
        return  name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

    }

    /**
     * This method returns if
     * @return true/false
     */
    public static boolean isPalindrome (String word) { //anna
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed +=  word.charAt(i);
        }
        return word.equals(reversed);
    }


        public static String uniqueCharacters (String str){
            String uniques = "";

            for (int i = 0; i < str.length(); i++) {
                char eachOuterLetter = str.charAt(i);
                int count = 0;


                for (int j = 0; j < str.length(); j++) {

                    char eachInnerLetter = str.charAt(j);

                    if(eachOuterLetter == eachInnerLetter){

                        count++;
                    }
                }
                if(count == 1){ //This condition checks if the letter is in the String ONLY 1 time,
                    // If true add it to the string container uniques
                    uniques += ("" + eachOuterLetter);
                }
            }


            return uniques;
        }
}
