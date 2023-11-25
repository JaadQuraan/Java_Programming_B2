package day39_a_polymorphism.book;

public class JavaTextBook extends EBook {

    boolean isfun;

//    public JavaTextBook(String name){
//        this.name = name;
//    }
    public void read(){
        System.out.println("Reading Java Text Book");
    }

    @Override
    public void download() {
        System.out.println("Downloading Java Text Book");
    }

    @Override
    public void open() {
        System.out.println("Opening Java Text Book");
    }
}
