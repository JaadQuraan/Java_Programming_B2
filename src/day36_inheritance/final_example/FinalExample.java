package day36_inheritance.final_example;
//Final class means we cannot inherit
public final class FinalExample {
    final int a = 5;
   // final int b;
    //Whenever it is final we
    // must give the value to it

    int b;

    public static final String PLANET = "Earth";

    public FinalExample(){

    }
    //if we did not have the constructor above
    //we do not have to give the value
    //directly to the final variable
    public FinalExample(int b){
        this.b = b;
    }


}

//final class cannot be parent class
//final variable cannot change the value