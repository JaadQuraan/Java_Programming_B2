package day39_a_polymorphism.clothes;

import day39_a_polymorphism.animal.Animal;

public class Store {
    public static void main(String[] args) {

        //AllPOSSIBLE REFERENCES
        //#1 reference ITSELF

        TShirt tshirt1 = new TShirt();
        tshirt1.wear();

        //#2 Reference is super which is abstract class
        Clothes tshirt2 = new TShirt();
        tshirt2.wear();

        Object tshirt3 = new TShirt();
       // tshirt3.wear();
        //Object class does not have reference to the wear() method


      //  HasHood tshirt4 = new TShirt();
        //Tshirt class does NOT implement HasHood interface
        //That is why it cannot be a reference


        //All POSSIBLE references Jacket

        //#1 itself
        Jacket jacket1 = new Jacket();
        jacket1.wear();
        jacket1.putOnHood();

        //#2 = Super class
        Clothes jacket2 = new Jacket();
        jacket2.wear();
        //jacket2.putOnHood();
        //Clothes reference does not have access to putOnHood(); method
        // If you do not have version of this one in Parent class cannot run this
        //If there is no Parent one and trying to give reference of the parent it will not have access to that

        //3  Interface
        HasHood jacket3 = new Jacket();

       // jacket3.wear();
        //HasHood reference does not have access or visibility to wear();
        //No version of wear();in the interface
        jacket3.putOnHood();

        Object jacket4 = new Jacket();
//        jacket4.wear();
//        jacket4.putOnHood();

        //Object class does NOT have reference to wear and put on hood


        System.out.println("----------------");
    //Since main method is static, accepts only static methods
        buy(tshirt1);
        buy(jacket1);
        buy(new TShirt());
        buy(new Jacket());

    }
    public static void buy(Clothes clothes){

        if(clothes instanceof TShirt){ //Shows if the object is a certain class
            //Is the TShirt object inheritance relationship of Clothes? Yes
            System.out.println("Bought TShirt");
        } else if (clothes instanceof Jacket){
            System.out.println("Bought Jacket");
        }

        //Since the parent can be the ref of this object it can be called with clothes as well
    }


}
