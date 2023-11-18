package day36_inheritance.access.b;

import day36_inheritance.access.a.First;
//DIFFERENT CLASS,DIFFERENT PACKAGE
public class Fourth extends First {
    public static void main(String[] args) {


        First obj = new First();
        System.out.println(obj.one);
       // System.out.println(obj.two);
        //This obj is of First class, so protected doesnt
        //inherit here
      //  System.out.println(obj.three);
        //System.out.println(obj.four);

        Fourth obj2 = new Fourth();
        System.out.println(obj2.one);
        System.out.println(obj2.two);
     //   System.out.println(obj2.three);
      //  System.out.println(obj2.four);
    }
    //Whenever is protected, child class can have access to it
    //even in a different package
    //Any child class can inherit if even if its in diff package
}
