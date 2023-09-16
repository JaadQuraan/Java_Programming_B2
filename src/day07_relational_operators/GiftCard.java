package day07_relational_operators;
/*

    Task:
        declare and assign a gift card with 200
        buy 2 items.
            buy item 1 for x price and subtract from your gift card
            buy item 2 for x price and subtract from your gift card
        print the remaining balance of your gift card

        100
        40

*/
public class GiftCard {
    public static void main(String[] args) {
        double giftCardBalance = 200;
        double secondItem = 50;
        //_$ only variable name special characters
        System.out.println("Buy item1 for $100");
        giftCardBalance -=100;
        System.out.println("Buy item2 for $"+secondItem);
        giftCardBalance -=secondItem;
        System.out.println("Your gift card balance is now: $"+giftCardBalance);

    }
}
