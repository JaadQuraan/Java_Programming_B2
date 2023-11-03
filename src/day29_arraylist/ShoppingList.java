package day29_arraylist;

import java.util.*;
//import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> shoppingList = new ArrayList<>();
        //check if shoppingList is empty or some items
        statusOfShoppingList(shoppingList);
        //Ask a user to enter item to add into Shopping List and continue
        // until user does not want to enter more

        askToAddItems(shoppingList);
        //Print out all the items from the list one by one
        showListItems(shoppingList);
        //If specific item is in the shopping list


        System.out.println("List has item? " + hasItem(shoppingList,"apple"));
//        System.out.println("----------------");
//        System.out.println("List has the item? " + hasItem(shoppingList));

        //Create a method that removes item based on index;
//        removeItem(shoppingList,2);
        showListItems(shoppingList);
        removeItemUser(shoppingList);
    }
    //TODO: Ask a user what item to check if it is in the list
    public static void removeItemUser (ArrayList<String> list){
        //added 3 items
        Scanner input = new Scanner(System.in);
        System.out.println("What index do you want to remove? ");
        int index = input.nextInt();
        if(index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println(index + " is out of range");
        }
    }
    public static void removeItem (ArrayList<String> list, int index){
        //added 3 items
        if(index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println(index + " is out of range");
        }
    }

    public static boolean hasItem (ArrayList<String> list, String item){
       return list.contains(item);
    }
    //TODO: Ask a user what item to check if it is in the list
    public static boolean hasItem (ArrayList<String> list){
        Scanner input = new Scanner(System.in);
        System.out.println("What item do you want to check for? ");
        String userItem = input.nextLine();
        return list.contains(userItem);
    }
    public static void showListItems(ArrayList<String> list){
        System.out.println("Shopping List items: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t" + (i+1) + " " + list.get(i));
        }
    }
    public static void statusOfShoppingList (ArrayList<String> list){
        if(list.isEmpty()){
            System.out.println("Shopping List is Empty!");
        } else {
            System.out.println("Shopping List has items!");
        }
        //System.out.println(shoppingList.isEmpty() ? "Shopping List is Empty!":"Shopping List has items!");
    }

    public static void askToAddItems (ArrayList  <String> list){
        Scanner input = new Scanner(System.in);
        String userDecision = "";
        do {
            System.out.print("Enter the item: ");
            list.add(input.nextLine());
            System.out.print("Do you want to add more? Enter y/n: ");
            userDecision = input.nextLine(); //while y or Yes continue the loop
        }while (userDecision.equalsIgnoreCase("y") ||  userDecision.equalsIgnoreCase("yes"));

    }
}
//   //if you call method by class name it is static