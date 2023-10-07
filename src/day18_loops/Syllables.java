package day18_loops;
/*Given a string count syallabes
 ja-va
 */
public class Syllables {
    public static void main(String[] args) {
        String str = "ja-va-script";

        int countDash = 0;
        for (int i = 0; i < str.length(); i++) {
            //check if character = to '-'
            if (str.charAt(i) == '-'){
                countDash++;
            }

        }
        System.out.println("Syllables: " +  (countDash+1));


    }

}
