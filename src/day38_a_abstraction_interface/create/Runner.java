package day38_a_abstraction_interface.create;

public class Runner {
    public static void main(String[] args) {
        //Create obj = new Create(); Cannot create obj of intterface

        Book obj2 = new Book();

        obj2.read();
        obj2.write();

    }
}
