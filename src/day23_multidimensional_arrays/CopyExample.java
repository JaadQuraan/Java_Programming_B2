package day23_multidimensional_arrays;
/*
    Arrays.toString(arrName);
    Arrays.equals(arr1, arr2);
    Arrays.sort(arrName);
    Arrays.copyOf(arrName, anySize);

    String str = "java";
        str.toCharArray();
        str.split("str");
    String.join("", arrName)
    String.join("anyValue", arrName)

    String str = new String(charArrName);
 */
import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int []b = a; // 'b' is another reference/name, but the array is the same as the one 'a' is pointing to
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0] = 100;
        a[1] = 200;


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b)); //both changed b is still pointing to a
        System.out.println();

        //Arrays.copyOf(arrName, size)
        int [] z = Arrays.copyOf(a,a.length); //Creates a brand new array.  Do not always need to give same size
        System.out.println(Arrays.toString(z)); // size 3
        System.out.println();
        z[0] = 500;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(z));
        System.out.println();

        int [] x = Arrays.copyOf(z,z.length+2); //size 5
        System.out.println(Arrays.toString(x)); // [500, 200, 3, 0, 0]
        //default values of 0 for the int
        System.out.println();
        int [] y = Arrays.copyOf(z, z.length - 1);
        System.out.println(Arrays.toString(y)); // [500,200]



    }
}
