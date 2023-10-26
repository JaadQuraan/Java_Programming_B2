package day25_methods;
/*
Algorithm to drive the car.
    unlock the car
    open the door
    sit in the car
    close the door
    put the seatbelt on
    start engine
    put into drive mode and go
 */
public class Car {
    //create a method that unlocks the door
    public static void unlockCar () { // non-parameterized method -> meaning nothing inside the parenthesis
        //this is method declaration
        System.out.println("Unlocking the car.");
    }
    public static void openDoor () {
        System.out.println("Opening the door");
    }
    public static void sitInCar () {
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }
    public static void getReadyToGo (){
        System.out.println("Putting on seatbelt");
        System.out.println("Check the mirrors");
        System.out.println("Put the music on");
        System.out.println("Put the navigation on");

    }
    public static void startCar (){
        System.out.println("Starting the car");
    }
    public static void driveAndGo () {
        System.out.println("put into drive mode and go");
    }
    public static void driveInRush (){
        unlockCar();
        sitInCar();
        startCar();
        driveAndGo();
    }
    //I am in a hurry so need to do only few methods
    public static void main(String[] args) {

        unlockCar(); //calling a method - this is not method declaration
        //unlockCar();

        openDoor();
        sitInCar();
        startCar();
        getReadyToGo();
        driveAndGo();

        System.out.println();
        driveInRush();

    }

}
