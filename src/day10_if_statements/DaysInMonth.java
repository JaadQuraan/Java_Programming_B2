package day10_if_statements;
/*
     31 days ---> 1, 3, 5, 7, 8, 10, 12
     30 days ---> 4, 6, 9, 11
     28 days ---> 2
      */
public class DaysInMonth {
    public static void main(String[] args) {
     int month = 1;
     boolean is31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
     boolean is30 = month == 4 || month == 6 || month == 9 || month == 11;
     boolean is28 = month ==2;
     if(is31){
         System.out.println("This month has 31 days");
     }

     if(is30) {
         System.out.println("This month has 30 days");
     }
     if (is28){
         System.out.println("This month has 28 days");}

        System.out.println("=============================================");
        if(is31){
            System.out.println("This month has 31 days");
        }else if(is30) {
            System.out.println("This month has 30 days");
        } else if (is28){
            System.out.println("This month has 28 days");}


        System.out.println("============================================");

        char letter = 'a';
        if(letter =='a'){
            System.out.println("hello");
        }
        if(letter =='a'){
            System.out.println("bye");
        }
        System.out.println("----------------------------------------");
        if(letter =='a'){
            System.out.println("hello2");
        } else if (letter=='a'){
            System.out.println("bye2"); // will not be printed since first condition is true
        }
        System.out.println("=========================================================");

        int num = 0;
        if(num>3){
            System.out.println("Bigger than 3");
        } else if (num>2){
            System.out.println("Bigger than 2");
        } else if(num>1){
            System.out.println("Bigger than 1");
        }
    //Once you find the true one it will stop execution
        //The if conditions will be checked until the first true if statement is found
        // and the rest will be skipped if there are any

        System.out.println("=========================================================");

        int num2=5;
        char letter2 = 'b';
        if(num2>3){
            System.out.println("Nummber is bigger");
        }
        if(letter2 =='b'){
            System.out.println("Letter is equal b");
        }

    }



    }

