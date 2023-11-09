package day31_custom_classes;

public class UsingTrafficLight {
    public static void main(String[] args) {
        //Object reference  =  Actual Object
        //                     new constructor including ()
        TrafficLight light1 = new TrafficLight("yellow");
        System.out.println(light1.light);
        TrafficLight light2 = new TrafficLight("red");
        System.out.println(light2.light);


        //TrafficLight light2 = new TrafficLight()
        //light2.light = "red"
        //  No need to do this anymore because the constructor
        //  handles this through the parameter
    }
}
