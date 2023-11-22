package day37_a_abstraction.cars;

public  class Toyota extends Car{
    @Override
    public void start() {
        System.out.println("Insert Key");
        System.out.println("Turn the key");
    }
}
//method signature same name and parameter