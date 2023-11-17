package day35_inheritance.book;
//AudioBook IS-A Book
public class AudioBook extends Book{


    //child class calls parent constructor
    double duration;
    String narrator;

    public void listen(){
        System.out.println("Listening to: " + super.title+
        " narrated by: " + narrator);
    }
    //super.title use the title from the super class
}
