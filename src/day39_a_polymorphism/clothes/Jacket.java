package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood {

    public void wear(){
        System.out.println("Wearing jacket");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting on jacket hood");
    }
}
