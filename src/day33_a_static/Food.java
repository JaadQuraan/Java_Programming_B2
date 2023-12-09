package day33_a_static;

public class Food {

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food (String name){
        this.name  = name;
    }
    public Food (String name, int quantity){
        this(name);
        this.quantity = quantity;
    }
    public Food (String name, int quantity, double unitPrice){
        //this.name = name;
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = unitPrice * quantity;
        //you can use this but don't need to use because there is
        // no local variable to differentiate
    }

    public String toString(){
        return "Info about the Food: "  +
                "\n\t Name: " + name +
                "\n\t Quantity: " +  quantity +
                "\n\t Unit Price: $"  + unitPrice +
                "\n\t Total Price: $" + totalPrice;
    }
}
