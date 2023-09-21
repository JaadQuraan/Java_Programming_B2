package day10_if_statements;

public class IfWithoutBrackets {
    public static void main(String [] args){
        //single if statement with brackets
        if(1>2) {
            System.out.println("Hello");
        }
        //If statement with bracket which has 2 statements
        if(4>1) {
            System.out.println("Hello 2");
            System.out.println("Bye2");
        }

        //Single if statement without brackets- which can ONLY have one statement

        if(5<1)
            System.out.println("Hello without brackets"); /*It is RECOMMENDED to use curly braces even if you only have
        one statement belonging to if*/
        System.out.println("Another print statement"); //This one has nothing to do with if statement








    }
}
