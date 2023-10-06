package day17_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = "Shopping List";
        String addMore = "";
        do {
            System.out.print("Enter the name of the item: ");
            String itemName = input.nextLine();
            list = list + "\n\t" + itemName;

            System.out.print("Do you want to add more to your shopping list?  ");
            addMore = input.nextLine(); //this container is only available in this body
        }while (addMore.equalsIgnoreCase("yes")); // If yes ---> continue adding

        System.out.println(list);




    }
}
