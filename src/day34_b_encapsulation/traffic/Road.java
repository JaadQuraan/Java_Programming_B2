package day34_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("green");
       // light.color = "red";

        //How can I have indirect access to read
        System.out.println(light.getColor());


        TrafficLight light2 = new TrafficLight("yellow");
        System.out.println(light2.getColor());

        //can you change and re-assign the color for the objects
        light.setColor("red");
        light2.setColor("pink");

        System.out.println();
        System.out.println(light.getColor());
        System.out.println(light2.getColor());


    }
}
