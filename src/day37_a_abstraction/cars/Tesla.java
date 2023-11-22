package day37_a_abstraction.cars;

public class Tesla extends ElectricCar{


    @Override
    public void start() {
        System.out.println("Start remotely");
    }
    @Override
    public void charge() {
        System.out.println("Charging tesla");
    }
    //concrete class
}
