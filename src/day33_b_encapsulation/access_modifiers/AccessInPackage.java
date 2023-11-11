package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {
    /**
     * In the SAME package but in DIFFERENT Class
     */
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a); //CAN ACCESS
        System.out.println(obj.b); //CAN ACCESS
      //  System.out.println(obj.c);//CANNOT ACCESS
        // c is private.
        //private is only accessible within the same class
        System.out.println(AccessModifier.x); //CAN ACCESS
        System.out.println(AccessModifier.y); //CAN ACCESS
      //  System.out.println(AccessModifier.z); //CANNOT ACCESS
        // z is private


        /**
         * 'c' and 'z' are not accessible outside of the class
         * Because they are private
         * In whole project, use public
         */

    }

}
