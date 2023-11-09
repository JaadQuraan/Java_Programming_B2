package day31_custom_classes;

public class TrafficLight {
    String light;

    //We explicitly defined a constructor
    //The default constructor will not be created
    //This will do the same thing, but with custom one
    // you can create constructor with argument
    //Default one is with no parameter
//    public TrafficLight(){
//
//    }
    public TrafficLight(String color){
        light = color;
    }

}
