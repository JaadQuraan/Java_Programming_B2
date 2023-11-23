package day38_a_abstraction_interface.interface_methods;

public class MacbbokPro implements Mac {


    @Override
    public void turnOn() {
        System.out.println("Macbook is turning on");
    }
}

class Runner{
    public static void main(String[] args) {
        System.out.println(Mac.NAME);
        System.out.println(Mac.OS);
        System.out.println(MacbbokPro.NAME); //inherited NAME and OS
        System.out.println(MacbbokPro.OS);
        //you can do this meaning you can call interface public static final variable
        //With the class name which implements that interface
        //But it is NOT GOOD PRACTICE
        //If those variables belong to an interface use the interface name to call them
        System.out.println();
        MacbbokPro obj = new MacbbokPro();
        obj.turnOn();
        obj.factime();

        //obj.company();
        //This is static method in interface and static method in interface do not get inherited
        //They can be accessed only by the interface name
        //Static method may be invoked on containing interface class only
        //Static methods do not get inherited from interfaces
        Mac.company();
    }
}