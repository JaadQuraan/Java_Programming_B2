package day11_if_statements;
//related to if else
public class TernaryExample {
    public static void main(String[] args) {


        int a =4;
        String evenOrOdd="";

        if(a % 2 ==0){
            evenOrOdd = "Even";
        } else {
            evenOrOdd = "Odd";
        }

        //In Java, there is a shorter syntax version of if else

        evenOrOdd = (a % 2 == 0) ? "Even" : "Odd";
        /*
                    (a % 2 == 0) --> Condition
                    ?            --> Check if true or false
                    "Even"       --> First value is always for TRUE
                    :            --> else
                    "Odd"        --> second value is always for FALSE

                    firstValue and secondValue HAS TO BE SAME DATA TYPE

                    Whatever you assign it to has to be same data type as values
         */

        int num = 4;
        String result = (num>10) ? "Bigger than 10" : "Not Bigger Than 10";

        int number = -4;
        String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "Zero";
        // String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "Zero"
        //  String sign = (number > 0) ? "positive" : "negative";
        /*
                    SYNTAX
                        (condition) ? value1 : value2
                        Do the one that matches the syntax first
         */
// This is same as one above
        if ( number > 0){
            sign = "positive";
        } else {
            if (number < 0){
                sign = "negative";
            }else {
                sign = "Zero";
            }
        }
    }
}
