package day44_map_and_functions.functional_interface;

public class UsingNumberInterface {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {
            if(n % 2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };
        //reference is interface
        evenOrOdd.apply(28);
        evenOrOdd.apply(23);
        System.out.println("--------------------");
        //need () if you have more than one parameter in your functional interface
        NumberInterface cube = number -> {
           // Math.pow(number,3);
            System.out.println(number*number*number);
        };

        cube.apply(3);
        cube.apply(5);
    }


}
