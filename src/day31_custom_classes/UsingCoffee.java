package day31_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee(); //Now we have an object of this class
        //Coffee coffee2 = new Coffee();
//        System.out.println(coffee1); null Strings and 0.0 double
        coffee1.price = 4.99;
        coffee1.size = 16;
        coffee1.brand = "Lavazza";
        coffee1.type = "Americano";
        //Each instance variable belongs to the object
        System.out.println(coffee1);
        coffee1.drink(); //instance method needs to be called with object
        System.out.println(coffee1);
        coffee1.refill(2);
        coffee1.refill(4);
        System.out.println(coffee1);


//        coffee2.drink(); Drinking null of coffee
    }


}
