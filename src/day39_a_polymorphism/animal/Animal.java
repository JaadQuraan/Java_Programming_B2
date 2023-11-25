package day39_a_polymorphism.animal;
//We can still have constructor but we cannot create an object with abstract class
//Abstract cannot be final or private
public  class Animal {
    String name;
    public  void eat(){
        System.out.println("Animal is eating");
    }
}
