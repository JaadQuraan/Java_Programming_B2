package day34_b_encapsulation.pizza;

public class PizzaStore {
    public static void main(String[] args) {


        Pizza pizzaOne = new Pizza("Tall", -3);
//        System.out.println(pizzaOne.size); private
//        System.out.println(pizzaOne.numberOfToppings);

        System.out.println(pizzaOne.getSize()); //null
        System.out.println(pizzaOne.getNumberOfToppings()); //0
        Pizza pizzaTwo = new Pizza("small", 3);

        System.out.println(pizzaTwo.getSize()); //small
        System.out.println(pizzaTwo.getNumberOfToppings()); //3

        pizzaTwo.calculatePrice();
        System.out.println(pizzaTwo);
    }
}
