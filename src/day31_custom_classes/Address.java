package day31_custom_classes;

public class Address {
    String street;
    String city;
    String state;
    String zipcode;
    //    public Address (String inputStreet, String inputCity, String inputState, String inputZipcode) {
//        street = inputStreet;
//        city = inputCity;
//        state = inputState;
//        zipcode = inputZipcode;
//    }
//
    public Address (String street, String city, String state, String zipcode){
        this.street  = street;
    //  instance variable = local variable
        //Assigning local to the instance
        this.city    = city;
        this.state   = state;
        this.zipcode = zipcode;


        //Taking local variable and assigning to instance variable
        //If you don't use this keyword its basically re-assigning to itself


    }
}
