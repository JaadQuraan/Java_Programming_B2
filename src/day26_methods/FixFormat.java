package day26_methods;
/*
EX: TOm --> Tom
    WINNIe -> Winnie

 */

import java.util.Locale;
import java.util.Scanner;

public class FixFormat {

    public static String fixFormat (String name){
        return  name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scan.nextLine();
        System.out.println(fixFormat("wiNNIe"));
        System.out.println(fixFormat("ToM"));
        System.out.println(fixFormat("jaad"));
        System.out.println(fixFormat("JaAd"));
    }

    //TODO: Can you improve this code in case if user gives more than one word

}
