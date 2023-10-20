package day23_multidimensional_arrays;

public class AWS {
    public static void main(String[] args) {


        String zones = "us-east1, us-west1, us-south1, us-north1";
        String app = "Etsy";

        // "application is deploying on $us-east1"
        //First I need to get each zone. I can use  .split method to separate each zone and store al of them into an array

        String [] zoneArray= zones.split(", "); //["us-east1", "us-west1", .........] --> size: 4

        for (int i = 0; i < zoneArray.length; i++) {
            System.out.println(app + " is deploying on " + zoneArray[i]);
        }
        System.out.println("----------------------------");

        for (String each : zones.split(", ")) { //zones is only a String have to convert it to array.
            // Can also put zoneArray here
            System.out.println((app + " is deploying on " + each));
        }

    }
}
