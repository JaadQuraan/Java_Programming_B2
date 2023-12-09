package day39_a_polymorphism.animal;

public class Reptile extends Animal{

    int numberOfClaws;

    @Override
    public void eat() {
        System.out.println("Reptile is eating");
    }
}
