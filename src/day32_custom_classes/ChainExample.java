package day32_custom_classes;

public class ChainExample {

    int a =5;

  //Constructor runs before instance variables
    public ChainExample () {
        System.out.println("First");
    }

    public ChainExample (int i){
        this(); //this will call the constructor that matches this parenthesis
        System.out.println("Second");
    }

    public ChainExample (String str){
         this(5);//has to be first line in constructor
       // this(a); Constructor runs first and then int = a runs at the top
        //Cannot do this
        System.out.println("Third");
    }

}
