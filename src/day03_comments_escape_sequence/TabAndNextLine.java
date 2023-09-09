package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main(String[] args) {
        //The following are about /t - tab
        System.out.println("This is not tabbed");
        System.out.println();
        System.out.println("\tThis is not tabbed"); //this is tab 1 time
        System.out.println("    This is not tabbed"); // 4 space is equal to 1 tab
        System.out.println("\t\tThis is tabbed 2 times"); // /t/t 2 tabs
        System.out.println();
        //The followings are about /n - new line
        System.out.println();
        System.out.println("1)Go to the store");
        System.out.println("2)grab milk");
        System.out.println("3)pay cashier");

        System.out.println("\n1)Go to the store \n2)grab milk \n3)pay cashier \n");

        //MAC--> Option + command + L
        //Windows --> ctrl + alt + L
        //This organizes the code
    }

}
