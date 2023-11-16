package day34_a_static.computer;

/*
Computer - static

class name: computer:
    instance variables:
        price, brand, color, ...

    static variables: hasScreen, hasBattery, hasMemory

    make objects of the class in a main method and
    access both instance and static members from proper references
 */
public class Computer {

//Access modifiers for these 3 are default
    //default values: brand = null price = 0.0 color = null
    String brand;
    double price;
    String color;

    static boolean hasScreen, hasBattery, hasMemory;
    //default values: all false

    static {
        System.out.println("Static block run");
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    public Computer(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //create a method that prints brand and memory info

    //Static only accepts static

    public void test () {
        System.out.println("Brand: "  + brand);
        System.out.println("Memory: " + hasMemory);
    }
    public static  void test2 () {
       // System.out.println("Brand: "  + brand);
        System.out.println("Memory: " + hasMemory);
    }

}
