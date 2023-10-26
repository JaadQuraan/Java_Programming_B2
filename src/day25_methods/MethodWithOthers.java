package day25_methods;
/*
    1- Monday
    2- Tuesday
    .
    .
 */
public class MethodWithOthers {

    //In switch we did not use the break statement because once the return statement is
    // reached the method ends
    public static String dayInWords (int day) {
       switch (day){
           case 1:
               return "Mon";
           case 2:
               return "Tues";
           case 3:
               return "Wed";
           case 4:
               return "Thurs";
           case 5:
               return "Fri";
           case 6:
               return "Sat";
           case 7:
               return "Sun";
           default:
               return "Invalid Number";
       }
    }

    public static void main(String[] args) {
        System.out.println(dayInWords(1));
    }
}
