package day44_map_and_functions.functional_interface;
@FunctionalInterface //SAM single abstract method
public interface NumberInterface {
    //You have to have 1 abstract method
    void apply(int n); //public abstract
    //apply or test are common methods name used in functional interface
    //We cannot create object.//We Can create implementation

    //Here always passing integer
}

