package day31_custom_classes;

public class Carpet {


    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    public Carpet (boolean inputIsPersian, double inputWidth, double inputLength, double inputUnitPrice) {
      //instance variable = local variable
        width = inputWidth;
        length = inputLength;
        isPersian = inputIsPersian;
        unitPrice = inputUnitPrice;
        calculatePrice(); // just method name.
        // They are in the same class
    }


    public void calculatePrice () {
        totalPrice = width * length * unitPrice;
        if(isPersian) totalPrice+=200;

    }

    @Override
    public String toString() {
        //if it is persian --> The persian Carpet

        return ((isPersian) ? "The persian carpet" :" The carpet") +
                "\n\tHas dimensions: "+ width + " x "+ length +
                "\n\tunitPrice $" + unitPrice +
                "\n\ttotalPrice $" + totalPrice;
    }
}
/*
Constructor runs first
Calling the constructor when you create an object
Take whatever is assigned and assigning those to the instance variables
Do calculatePrice method
Jump back to the UsingCarpet class

 */