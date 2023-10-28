package day27_wrapper_arraylist;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int [] arr = {1, 3, 5,  2, 123, 234};
        int num = 45;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(addElementInArr(arr, num)));
        System.out.println("--------------------------------");
        String []  words = {"loop", "array", "methods", "softskills"};
        String [] updatedWords = addElementInArr(words,"database");
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(updatedWords));
    }

    //Can you write a code that takes two parameters(int array, int num) and returns you a new int array
    //What are the two parameters data type and data type of array going to return
    public static int [] addElementInArr (int [] originalArr, int num){
        int [] newArr = Arrays.copyOf(originalArr,originalArr.length+1);
        newArr[newArr.length-1] = num;
        return newArr;
    }
    public static String [] addElementInArr (String [] originalArr, String str){
        String [] newArr = new String[originalArr.length+1];
        for (int i = 0; i < originalArr.length; i++) {//["java, "loop"]
            newArr[i] = originalArr[i];
        }
        //["java", "loop", null]
        newArr[newArr.length-1] = str;
        return newArr;
    }


    //How can we add number to a middle index. Have 3rd parameter index
}
