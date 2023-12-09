package day38_a_abstraction_interface.shopping;

//Interface to interface use extends
//Can get info from multiple interfaces
//We are passing methods from Shipping and ALlowUserToSell interfaces to the ConsumerApp
public interface ConsumerApp extends AllowUserToSell, Shipping{
}
//Here we are implementing two interfaces to a class: AllowUserToSell,Shipping
abstract class TestA implements AllowUserToSell, Shipping{

}
//Here I am implementing ConsumerApp interface which also inherits from interfaces called AllowUserToSell, Shipping
abstract class TestB implements ConsumerApp{

}

//interface can "extends" multiple interface
//class can "extends" ONE class
// class can implements multiple interfaces