package day07_relational_operators;

public class OperatorPractice {
    public static void main(String [] args){
       int num = 10;
       num++; //post-increment | No other code | just incremented by 1|
        System.out.println(num);

        num--;//post-decrement
        System.out.println(num);//10

        System.out.println(num++);//post increment-->We print the value first and then we update it
        System.out.println(num++); //output = 11 would be printed,num=12 after
        System.out.println(++num); //pre-increment --> we update it first, then use it --> num=13; | print
    }
}
