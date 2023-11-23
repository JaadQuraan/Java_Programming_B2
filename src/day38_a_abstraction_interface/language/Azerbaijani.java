package day38_a_abstraction_interface.language;

public class Azerbaijani implements Language{

    @Override
    public void hi() {
        System.out.println("Salam");
    }

    @Override
    public void bye() {
        System.out.println("Gule gule");
    }
}
