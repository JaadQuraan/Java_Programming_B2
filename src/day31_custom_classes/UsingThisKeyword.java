package day31_custom_classes;

public class UsingThisKeyword {
    public static void main(String[] args) {

        ThisKeyword t1 = new ThisKeyword(200);
        System.out.println(t1.num); //200
        //This will print 100 because instance variables are prioritized

    }
}
