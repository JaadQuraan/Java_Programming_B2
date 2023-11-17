package day35_inheritance.computer;

public class Mac extends Computer{

    static String os;
    static {
        os =  "macOS";
    }
    public Mac (int memory){
      // super();
    //super needs to match calling that constructor if you have inheritance relationship
    //Since there is no def constructor I need to call matching constructor from super class

        super(os, memory);
       // super("macOS", memory); Also works
        //pass this info to this constructor
    }
}
