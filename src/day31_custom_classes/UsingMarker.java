package day31_custom_classes;

import java.util.Scanner;

public class UsingMarker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the type:, brand: color: ");

        Marker marker3 = new Marker(input.next(), input.next(), input.next());

      Marker marker1 = new Marker("Dry erase","Expo","Blue");
        System.out.println(marker1.toString()); //

        Marker marker2 = new Marker("Wide","Sharpie","Black");
        System.out.println(marker2.toString());

//            Marker marker3 = new Marker();
//            marker3.type = "Narrow";
//            marker3.brand = "Uni";
//            marker3.color = "Yellow";

    }
}
