package day33_a_static;

public class BestBuy {
    String location; // instance variable
    static String headQuarter = "Minnesota, US";
    //static String ceoName; Static because CEO will the same for each store

    static String day = "Saturday";
    public BestBuy (String location){
        this.location = location;
    }

    //Instance method
    //They CANNOT be called by the class name
    //Instance CAN accept static and instance variables
    public void openStore (){
        System.out.println("Opening: " + location);
        System.out.println("Headquarter is: " +  headQuarter);
        //countStock();// this works
    }
    //Static method
    //Static methods can be called by Class and Object ref
    // (but do not do it by obj ref)
    //Static method can ONLY accept STATIC variables
    public  static void countStock (){
       // System.out.println("Counting stock in: " + location);
        System.out.println("Headquarter is: " +  headQuarter);
        //static methods are the same for each object
        //Headquarter works here but not location since location
        //is instance variable

    }


}
//Every object has its own copy of instance variables
//Instance variables cannot be called with the class name

//Every object has the SAME copy of static variables
//Static variables can be called by Class name and object reference name
//(but do not use object reference name)