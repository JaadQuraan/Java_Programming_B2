package day03_comments_escape_sequence;

public class Quote {

    public static void main (String [] args) {

        /*
            Q: How can I output the following
            I like "Java" programming

         */
        // I like "Java" programming
        System.out.println("I like \"Java\" programming");

        //Single quote is used as part of java syntax as well
        System.out.println("I like 'Java' programming");

        //How can I print backward slash?
        System.out.println("I like \\Java\\ programming");

        System.out.println("abc\\\\\\def");

    }
}
