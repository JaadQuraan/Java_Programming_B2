package day09_b__if_statements;
/*
      int score = 60;
      if (score >= 75){  // false
          System.out.println("You passed the exam!");
      }

      if (score < 75) {  // true
          System.out.println("You failed!");
      }
   */
public class IfElseExample {
    public static void main(String [] args){

        int score = 50;


        if(score >=75){// check if body if this line TRUE, execute the if body


            System.out.println("Passing");
        } else  {//if condition in line 18 is FALSE, execute the else body
            System.out.println("failing");
        }

        //block of code does not do anything by itself
        System.out.println();
       /* int year = 2024;
        boolean isLockdown = year == 2020 || year == 2021; //true

        if(isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study java");
            System.out.println("When you study put your mask on");
        }
        if(!isLockdown){
            System.out.println("Party");
            System.out.println("This is not a normal party, this is a java party");
            System.out.println("Travel");*/
        int year = 2024;
        boolean isLockdown = year == 2020 || year == 2021; //true

        if(isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study java");
            System.out.println("When you study put your mask on");
        }
        else{
            System.out.println("Party");
            System.out.println("This is not a normal party, this is a java party");
            System.out.println("Travel");
        }
        }

    }


