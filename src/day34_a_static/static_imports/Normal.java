package day34_a_static.static_imports;

import my_utilities.StringUtil;
//Imported entire StringUtil class from my_utilities package

import java.util.Arrays;
//Imports entire arrays class from java util package

public class Normal {
    public static void main(String[] args) {
        int [] a = {2,3,5,6,7};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(StringUtil.reverse("java"));
        //When you can call with class name it is a static method
    }
}
