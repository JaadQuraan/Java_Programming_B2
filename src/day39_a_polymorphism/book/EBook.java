package day39_a_polymorphism.book;

public abstract class EBook extends Book implements Downloadable{

//    public EBook(String name){
//        super(name);
//    }
    double  size; //MB

    public abstract void open();

}
