package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

//DIFFERENT class DIFFERENT PACKAGE
public class Third{
    public static void main(String[] args) {
        First obj = new First();

        System.out.println(obj.one);
       // System.out.println(obj.two);
        //System.out.println(obj.three);
       // System.out.println(obj.four);

        //four is not accessible  - is private
        //three is not accessible because it is default
        //two is not accessible - it is protected - (visible in diff package
        // if there is inheritance relation

    }
}
