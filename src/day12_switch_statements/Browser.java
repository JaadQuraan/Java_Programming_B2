package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your browser: ");
        String browser = input.nextLine();//In case, we have multiple words

        System.out.println("Enter your URL: "); //URL--> It is a link in browser
        String url = input.nextLine(); //No need to fix it only if any other method from scanner before
        int n = 4;

        switch(browser){
            case "Chrome":
                System.out.println("Opening " + url +" in the " + browser + " browser");
                System.out.println("Loading.....");
                break;
            case "Edge":
                System.out.println("Opening " + url +" in the " + browser + " browser");
                System.out.println("Loading.....");
                switch(n){
                    case 4:
                        System.out.println("Open in 4 tabs");
                }
                break;
            case "Safari":
            case "SAFARI":
                System.out.println("Opening " + url +" in the " + browser + " browser");
                System.out.println("Loading.....");
            case "Firefox":
                System.out.println("Opening " + url +" in the " + browser + " browser");
                System.out.println("Loading.....");
            default:
                System.out.println(browser+" is not a valid browser");



        }


    }
}
