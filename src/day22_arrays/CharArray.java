package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] arr = {'j', 'a', 'v', 'a'};
        for (char eachChar : arr) {
            System.out.print(eachChar);
        }
        System.out.println();
        String word = "java";
        //declare new char array which will have size of ? -> word.length()
        char [] newArr = new char[word.length()];

        //loop through the String word and get each character
        for (int i = 0; i < word.length(); i++) {
            newArr[i] = word.charAt(i);

        }
        //String to charArray
        char [] charArr = word.toCharArray(); //Same thing as lines 13-21

        System.out.println(Arrays.toString(newArr)); // [j, a, v, a]
        System.out.println(Arrays.toString(charArr)); // [j, a, v, a]
        System.out.println();
        System.out.println(charArr); //java

        for (char everyChar : charArr) {
            System.out.println(everyChar); // j a v a new line
        }
        System.out.println();
        System.out.println(charArr[0]); // j

        //How can we covert char array into a String?
        char [] day = {'w', 'e', 'd', 'n', 'e', 's', 'd', 'a', 'y'};

        String str1 = Arrays.toString(day); // [w, e, d, n, e, s, d, a, y]
        System.out.println(str1);
        System.out.println();
        //for "wednesday" I can loop through day char [] day and concatenate it into a new String
        String allTogether =  "";
        for (char eachElem: day) {
            allTogether += "" + eachElem;
        }
        System.out.println(allTogether);// wednesday

        //String all2 = day.toString(); //[C@668bc3d5
        //System.out.println(all2);
        /**
         * The toString () method is coming from Object class which we will talk later
         */
        //This is the simple way to covert char array into the String
        String str3 = new String(day); //Coverts char array to String all together
        //Directly making new String into the heap
        System.out.println(str3); // wednesday
        System.out.println(str3.toUpperCase()); //WEDNESDAY. can use any String methods now
        System.out.println(("" + str3.charAt(0)).toUpperCase());

    }
}
