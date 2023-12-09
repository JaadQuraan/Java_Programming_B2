package day38_a_abstraction_interface.shopping;
//Interface - we cannot instantiate/ cannot create object
//All variables are public static final
//The methods by default are - public abstract
public interface Shipping {

    String COUNTRY = "USA"; // public static final at beginning

    void payForShipping (boolean b);
}
