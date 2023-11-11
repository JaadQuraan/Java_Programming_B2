package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifier;

public class AccessOutsidePackage {
    /**
     * In DIFFERENT package and DIFFERENT CLASS
     */
    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a); //CAN ACCESS
        //System.out.println(obj.b); //CANNOT ACCESS
       // System.out.println(obj.c);//CANNOT ACCESS


        System.out.println(AccessModifier.x); //CAN ACCESS
        //System.out.println(AccessModifier.y); //CANNOT ACCESS
      //  System.out.println(AccessModifier.z); //CANNOT ACCESS

        /**
         * 'c' and 'z' are not accessible outside of the class
         * Because they have private access modifier
         * 'b' and 'y' are not accessible outside of the package
         * Because they have default access modifier
         * In whole project, use public access modifier
         */


    }
}
