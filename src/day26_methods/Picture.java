package day26_methods;

public class Picture {

    //Method Overloading
    //When we have same method name and different parameters(different amount or different datatypes)


    public static void draw() {
        System.out.println("Trying to draw....");
    }

    //Being void or return type does not matter. This is not method overloading
//    public static boolean draw() {
//        System.out.println("Trying to draw....");
//        return false;
//    }

    public static void draw(String color){ //Single param
        System.out.println("Trying to draw with " + color);
    }

    public static void draw(int size){ //Single param
        System.out.println("Trying to draw with size of: " + size);
    }
//Cannot have same method name with same exact parameters in the same class
//    public static void draw(int size){ //Single param
//        System.out.println("Trying to draw with size of: " + size);
//    }

    public static void draw (String color,String color2){
        System.out.println("Trying to draw with colors: " + color +" and " + color2);
    }

    public static void draw (String color,int size){
        System.out.println("Drawing with color: " + color +" and size: " + size);
    }
    public static void draw (int size, String color){
        System.out.println("Drawing with color: " + color +" and size: " + size);
    }

    //Type parameter: If the method exists with the matching data type. It will call that one
    //If it does not exist, it will check the higher one
    //int -> long > float > double
    public static void test (double d){
        System.out.println("testing method with double: " + d);
    }
//    public static void test (int d){
//        System.out.println("testing method with double: " + d);
//    }


}
