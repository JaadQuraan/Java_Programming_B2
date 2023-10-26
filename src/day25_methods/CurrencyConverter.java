package day25_methods;
/*
Create a method that accepts the currency type and amount
Return the correct converted amount

100 USD - euro
1$ = 0.95 Euro
1$ = 150.23 Yen
1$ = 28.15 Lira
1$ = 83.17 Rupees
*/

public class CurrencyConverter {

    public static double covert(String currencyType, double amount){
        switch (currencyType.toLowerCase()){
            case "euro":
                return (amount * 0.95);
            case "yen":
                return (amount * 150.23);
            case "lira":
                return (amount * 28.15);
            case "rupees":
                return (amount * 83.17);
            default:
                return amount * 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(covert("Euro", 100));
        System.out.println(covert("EURO", 100));
        System.out.println(covert("yen", 100));
        System.out.println(covert("lira", 100));
        System.out.println(covert("rupees", 100));
        System.out.println("-------------------------------------");
        double convertedAmount = covert("RUPEEs", 100);
        System.out.println("With " + convertedAmount + " you can buy things");
    }
}
