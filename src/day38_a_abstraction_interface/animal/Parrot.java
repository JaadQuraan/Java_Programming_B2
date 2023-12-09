package day38_a_abstraction_interface.animal;

import day38_a_abstraction_interface.language.Language;

public class Parrot extends Bird implements Flyable, Language {
    @Override
    public void eat() {
        System.out.println("Parrots eat with their beaks");
    }

    @Override
    public void fly() {
        System.out.println("The parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("hi hi");
    }

    @Override
    public void bye() {
        System.out.println("bye bye");
    }
}
