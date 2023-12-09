package day25_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore(); //The value is not being used
        int score = getCreditScore(); //The value is being stored into score variable
        System.out.println(score); //score being used in print statement

        System.out.println(getCreditScore());
        System.out.println(getCreditScore() + 50);
        System.out.println("----------------------------");

        System.out.println(isGoodCreditScore(600));
        System.out.println(isGoodCreditScore(720));
        System.out.println("---------------------------");
        System.out.println(isGoodCreditScore(getCreditScore()));
        System.out.println("--------------------------------");

        System.out.println(isGoodCreditScore(500) ? "Is GOOD Score" : "Is NOT GOOD Score");
    }

    public static int getCreditScore () {
        return 800;
    }

    //create a method to check if it is good or not
    //good if bigger or equal 700
    //not good if less
    public static boolean isGoodCreditScore (int score){

        if(score>= 700){
            return true; //Once return is reached ends the method
        }  else {
           return false;
        }

        //this is same as above
        //return score >= 700
        //System.out.println("hello"); //This line will never be reached
    }
}
