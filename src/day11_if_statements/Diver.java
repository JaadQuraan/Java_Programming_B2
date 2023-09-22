package day11_if_statements;

public class Diver {
    public static void main(String[] args) {
        int oxygenLevel = 85 ;

        if(oxygenLevel > 90){
            System.out.println("Your tank is full");

        } else if (oxygenLevel>80) {
            System.out.println("Still okay");

        } else if (oxygenLevel>70) {
            System.out.println("Dont go too far");
        } else if (oxygenLevel>60) {
            System.out.println("Start to head back");
        } else if (oxygenLevel>50) {
            System.out.println("Be careful now you are at 50%");
        }else {
            System.out.println("Rest in peace");
        }

        System.out.println("----------------------------------------");

        if(oxygenLevel > 50){
            System.out.println("Your tank is full");

        } else if (oxygenLevel>60) {
            System.out.println("Still okay");

        } else if (oxygenLevel>70) {
            System.out.println("Dont go too far");
        } else if (oxygenLevel>80) {
            System.out.println("Start to head back");
        } else if (oxygenLevel>90) {
            System.out.println("Be careful now you are at 50%");
        }else {
            System.out.println("Rest in peace");
        }
        //does not work have to follow which order you need to go. In most cases follow from top to bottom

        System.out.println("----------------------------------------");

        String message="";
        oxygenLevel = 40;
        if(oxygenLevel > 90){
           message = "Your tank is full";

        } else if (oxygenLevel>80) {
            message = "Still okay";

        } else if (oxygenLevel>70) {
            message = "Don't go too far";
        } else if (oxygenLevel>60) {
            message = "Start to head back";
        } else if (oxygenLevel>50) {
            message = "Be careful now you are at 50%";
        }else {
            message = "Rest in peace";
        }
        System.out.println(message);

    }
}
