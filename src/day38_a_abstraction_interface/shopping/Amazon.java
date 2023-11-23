package day38_a_abstraction_interface.shopping;
//Final no other class can extend
//Final methods cannot override
//Final variables cannot change
public final class Amazon extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Paying for shipping"  : "Free shipping");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");
    }
}
//Amazon IS-A OnlineShopping
//Amazon IS-A Shopping
//Amazon IS-A Shipping