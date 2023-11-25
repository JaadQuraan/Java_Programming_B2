package day39_a_polymorphism.animal;

public class Lizard extends Reptile {

    String skinColor;

    @Override
    public void eat() {
        System.out.println("Lizard is eating");
    }
}
//To call from parent use super keyword. To call the one here you use this keyword