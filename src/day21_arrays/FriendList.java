package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have? ");
        int numOfFriends = input.nextInt(); // 7 --> 0,1,2,3,4,5,6

        String [] friendNameList = new String[numOfFriends];

        //How can I ask user to enter each friends name and store it into array?

        for (int i = 0; i < numOfFriends; i++) {
            System.out.print("Enter your friends name: ");
            String name = input.next();
            friendNameList[i] = name;
        }
        System.out.println(Arrays.toString(friendNameList));

    }
}
