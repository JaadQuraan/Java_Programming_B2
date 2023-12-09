package day38_a_abstraction_interface.create;

public class Book implements Create{
//We use implements

    @Override
    public void read() {
        System.out.println("Reading a book");
    }

    @Override
    public void write() {
        System.out.println("Writing a book");
    }
}
