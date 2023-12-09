package day30_b_custom_classes;

public class UsingApp {
    public static void main(String[] args) {

        App appOne = new App();
        appOne.name = "Etsy";
        appOne.version = 5.7;
        appOne.isFree = true;

        appOne.run(); //Etsy is running...
        System.out.println(appOne.version);
        appOne.update();
        System.out.println(appOne.version);
        System.out.println(appOne.isFree);

        System.out.println(appOne); //This will show the memory location

        //making new object and calling run method
        new App().run(); //null is running
        //using object directly


        System.out.println(new App().name);


        System.out.println("-----------------------");
        App appTwo = new App();
        appTwo.run(); // null is running...
        System.out.println(appTwo.version); //0.0

    }
}
