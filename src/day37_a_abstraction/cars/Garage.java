package day37_a_abstraction.cars;

public class Garage {

    public static void main(String[] args) {
        //Car obj = new Car();
        //Car class is abstract
        //That is why cannot have object

        Toyota obj2 = new Toyota();
        obj2.start();
        System.out.println();

        Honda obj3 = new Honda();
        obj3.start();

        //The first non abstract CHILD classes are called
        //Concrete classes
        System.out.println();
        Tesla obj4 = new Tesla();
        obj4.start();
        obj4.charge();

        //Tesla is first NON Abstract class which has to implement all the methods from parent or grandparent. In Tesla, we must override all those methods
    }
}
