package day33_a_static;

public class Iphone {

    String model;
    double price;

    static String company;

    static  String os;
    static boolean appleDay;
    static String day;

    //Runs only  once, before anything even constructor
    // It helps us to initialize our STATIC variables
    static {
        System.out.println("Running static");
        company = "Apple";
        day =  "Friday";
        os = "IOS";

        if(day.equals("Friday")){
            appleDay = true;
        }
    }
    public Iphone (String model,double price){
        System.out.println("RUNNING CONSTRUCTOR");
        //Runs twice before model and price
        //Constructor runs before toString method
        this.model = model;
        this.price =  price;
    }

    @Override
    public String toString() {
        return "Iphone Info" +
                "\n\tmodel: " + model +
                "\n\tprice: $" + price +
                "\n\tcompany: "  + company;
    }
}
//non static method can accept static variable
