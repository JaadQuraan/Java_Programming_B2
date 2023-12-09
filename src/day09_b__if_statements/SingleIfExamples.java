package day09_b__if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {

        if(false) {//if this is false,  the body of the if statement(code block) is skipped

            System.out.println("Hello World!");

        }
        System.out.println("Second line"); //this is a normal print statement that is NOT inside if statement


        if(true){
            //since the condition is true, the code insode of the if block will be executed
            System.out.println("Today is Saturday");
        }

        int score =60;
        if(score >= 75){
            System.out.println("You passed the exam!");

        }
        if(score<=75){
            System.out.println("You failed!");
        }

        System.out.println();
        int year = 2024;
        boolean isLockdown = year == 2020 || year == 2021; //true

        if(isLockdown) {
            System.out.println("Stay at home");
            System.out.println("Study java");
            System.out.println("When you study put your mask on");
        }
            if(!isLockdown){
            System.out.println("Party");
            System.out.println("This is not a normal party, this is a java party");
            System.out.println("Travel");
        }

    //any single if statement does not depend on another statement

    }

}
