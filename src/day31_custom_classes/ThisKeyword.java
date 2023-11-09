package day31_custom_classes;

public class ThisKeyword {
    int num = 100;

    public ThisKeyword (int num) {//Parameterized constructor
        // | int num = 200; | object has instance variable
        //System.out.println(num);
        num = 400; //num = 400;
        //This num is only in this constructor
        //System.out.println(num);

        System.out.println("----------");
        //System.out.println(this.num);
        // if you System.out.println(num) this will print local
        this.num = num;

    }

    /**
     * To differentiate the INSTANCE variable from LOCAL variable, we use 'this' keyword
     */
}
