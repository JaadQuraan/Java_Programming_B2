package day25_methods;

public class VoidVsReturn {
    public static void main(String[] args) {

        hello();
        bye(); //Once we call this method it returns data to us but in this line we have not used it as part of any code
        System.out.println(bye()); //Can use in print statement because this method is returning something
        System.out.println("-------------------");
        String str = bye();
        System.out.println(str);

    }
    public static void hello () {
        System.out.println("Hello");
    }

    public static String bye () {
        return "Bye"; // This method will return a String
    }

}
