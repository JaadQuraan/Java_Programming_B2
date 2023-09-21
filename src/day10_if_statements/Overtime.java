package day10_if_statements;

import java.util.Scanner;

/*

   create a double variable for your hourly rate
   create a double variable for the number of hours worked

   calculate your net pay, with consideration of overtime pay

       if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
           (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
*/
public class Overtime {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("What is your hourly rate?");
        double hourlyRate = input.nextDouble();
        System.out.print("How many hours did you work?");
        double numHours = input.nextDouble();
        double netPay;
        double overtimeHours=numHours-40;

        String message;

        if(numHours>40){
            netPay = (hourlyRate*40)+(1.5*hourlyRate*overtimeHours);
            message = "You worked "+numHours+" hours at a rate of $"+ hourlyRate+ " this week. "+overtimeHours+" hours were overtime, so you get additional" +
                    " pay for those hours. Your net pay this week is: $"+netPay;
            System.out.println(message);
        } else{
            netPay=hourlyRate*numHours;
            message = "You worked "+numHours+" hours at a rate of $"+ hourlyRate+ " this week. " +
                    "Your net pay this week is: $"+ netPay;
            System.out.println(message);
        }



        /*
        if numHours >40 you get overtime pay for numbers passed 40


         */

    }
}
