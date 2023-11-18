package day36_inheritance.final_example;

public class Main {
    public static void main(String[] args) {
//        Parent p = new Parent();
//        p.walk();
        new Parent().walk();
        new Child().walk();
    }
}

class Parent {

    public final void walk (){
        System.out.println("You are walking in Parent class");
    }
    //Whenever making instance method final you cannot override that method. Saying all child classes have to use this version
    //Cannot have own implementation for this method
}
class Child  extends Parent{

//    public void walk(){
//        System.out.println("You are walking in Child class");
//    }

        public void walk(String name){
        System.out.println("You are walking in Child class");
    }
    //Can overload final methods. CANNOT override final methods
    //Here are we just overloading the final walk method
}
//Cannot have two public class in one file
