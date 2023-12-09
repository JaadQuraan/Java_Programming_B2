package day36_inheritance.final_example;
//public class UseFinalExample extends FinalExample {
//This is not valid because FinalExample class is final which means we cannot inherit
public class UseFinalExample {

    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        System.out.println(obj.a);
       // obj.a = 10;
        //Since a is final instance variable, we cannot change the value
        System.out.println(obj.a);
        System.out.println();
        FinalExample obj2 = new FinalExample(20);
        System.out.println(obj2.a); //5
        //We cannot change a it is final
        System.out.println(obj2.b); //20

        System.out.println();
        System.out.println(FinalExample.PLANET);
       // obj.planet = "Mars";
        //Since planet is final we cannot
        // change the value
        System.out.println(FinalExample.PLANET);

    }
}
