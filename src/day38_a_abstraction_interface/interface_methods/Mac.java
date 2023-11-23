package day38_a_abstraction_interface.interface_methods;

public interface Mac {

    String NAME = "Mac";
    String OS = "IOS";

    void turnOn(); //public abstract

    //Q: is there a way to have a method in interface which has a body?
    //A: Yes 2 options

    //Option 1:  public static method
    //Anything in an interface is public
    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in LA");
        System.out.println("New releases in November");
    }

    //Option 2: is "public default" method
    //NOTE: The "default" here is not the access modifier "default"
    //Only specific to interface

    public default void factime(){
        System.out.println("Opening facetime");
        System.out.println("Calling facetime");
    }
}
