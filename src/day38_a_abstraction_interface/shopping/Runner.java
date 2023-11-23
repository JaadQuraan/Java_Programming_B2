package day38_a_abstraction_interface.shopping;

public class Runner {
    public static void main(String[] args) {


        Target obj1 = new Target();
        obj1.price = 10;
        System.out.println(obj1.price);
        obj1.buyItem();
        obj1.returnItem();
        System.out.println();
        Amazon obj2 = new Amazon();
        obj2.price = 100;
        System.out.println(obj2.price);
        obj2.viewCart();
        obj2.payForShipping(true);
        obj2.buyItem();
        obj2.returnItem();
    }
}
