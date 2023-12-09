package day45_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {



        //Creating streams
        //streams work with data structures
            // 1.Array
            // 2.Collection

        //1. Array
        int [] arr = {1,2,3,4,5};
        //In order to create a stream of array, Array itself does not have a method that we can use
        //But we have Arrays utility class which has the method stream() that can be used to take the Array and make stream

        Arrays.stream(arr); //This is not doing anything. We just converted array into stream

        //2.Collection
        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,8));
        list.stream(); //Directly use collection ref name
        //With collection we can Collection reference name directly to convert it to Stream

        //Now lets look at the methods that we can use from Stream

        //#1 .distinct(); --> to remove duplicates
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,8));
        System.out.println( "Distinct Method: " + list2.stream().distinct()); //This as it is just doing some action. It will show memory location
        System.out.println( "Distinct Method applied and converted to Collection: " + list2.stream().distinct().collect(Collectors.toList())  );
        //.collect() --> it takes what changes were made by Stream and converts it back to List (you can convert it to other Collection types as well.)

        /*
        stream() --> converts the list to stream
        distinct() --> remove duplicates
        .collect(Collectors.toList() --> Convert the stream back to list
         */
        System.out.println("Original: " + list2); //[1, 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8]
        //Does NOT change the original List
        list2 = list2.stream().distinct().collect(Collectors.toList()); //re-assigned
        System.out.println("Reassigned: " + list2);

        System.out.println();
        int [] arr2 = {1,1,1,2,3,4,4,4,5,6,7,8,8};
        System.out.println("Original: "+Arrays.toString(arr2));
        System.out.println( "Changed: "+ Arrays.toString( Arrays.stream(arr2).distinct().toArray()) );
        //Took arr converted to Stream, applied distinct to remove duplicates then converted back to Array and printed it
        arr2 = Arrays.stream(arr2).distinct().toArray();
        System.out.println("Reassigned: " + Arrays.toString(arr2));
        System.out.println();

        //skip() --skips the number of element that was provided in. Will skip first 'n' element
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list3.stream().skip(4)); //Here we converted List to Stream and applied skip method
        System.out.println("Original: " + list3); //original is not changed
        System.out.println("After skip: " + list3.stream().skip(4).collect(Collectors.toList())  );
        System.out.println("Original: " + list3); //original is not changed
        System.out.println("After skip: " + list3.stream().skip(7).collect(Collectors.toList())  ); //[8,9,10]

        String [] arr3 = {"java","hello","world","loop","computer"};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(2).toArray())); //[world, loop, computer]
        System.out.println();
        //limit()--> Keeps the first 'n' elements starting from beginning
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list4.stream().limit(6).collect(Collectors.toList()));
        System.out.println(list4.stream().limit(6).skip(3).collect(Collectors.toList()));
        //Getting first 6 then skip the first 3. method chaining


    }
}
