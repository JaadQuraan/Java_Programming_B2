package day34_a_static.computer;

public class ComputerLab {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //When creating object loading the class. static block runs first
        Computer comp1 = new Computer("HP",600.00,"Silver");
        System.out.println(Computer.hasBattery);

        System.out.println(comp1.brand);
        System.out.println(comp1.color);

        System.out.println(comp1.hasBattery); //not recommended
        //Can still access static members with obj ref
        System.out.println(Computer.hasBattery); //this way is better
       // System.out.println(Computer.brand); //Cannot do this
        //In order to access instance variables we have to create an object

    }
}
