package day15_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.next(); //www.google.com
        //                           0123456789...

        String result = ""+ url.charAt(4) + url.charAt(5) + url.charAt(6) +url.charAt(7) +url.charAt(8) +url.charAt(9);
        System.out.println(result);

        //substring (startIndex); --> startIndex is included
        //substring (startIndex, endIndex) --> endIndex is not included(up to that index)
        int startPoint = url.indexOf(".") + 1; //3. add 1 because we want start point to be 4
        System.out.println(startPoint);
        System.out.println(url.substring(startPoint));

        int endPoint = url.length()-4;
        System.out.println(url.substring(startPoint,endPoint));




    }
}
