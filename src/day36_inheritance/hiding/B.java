package day36_inheritance.hiding;

public class B extends A{

    @Override
    public void instanceMethod(){
        staticMethod();
    }

    public static void staticMethod(){

        System.out.println("Static from CHILD");
    }
    //No relation between these they are static methods
    //Once you have this static method hides the one from parent


}
