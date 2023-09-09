package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b =40;
        int i = b; //The value is automatically converted to int, because byte is smaller than int
        System.out.println(b);
        System.out.println(i);

        int i2 = 100;
        byte b2 = (byte)i2; //int is bigger than byte we must cast it. We castthe int type i2 to a byte type using (byte)

        System.out.println(i2);
        System.out.println(b2);

        int i3 = 500;
        long l1 = i3;
        //dont need casting going from smaller to bigger data type --> big, int is smaller than long, it will automatically cast

        long l2= 200;
        int i4 =(int)l2;

        System.out.println(l2);
        System.out.println(i4);

        double d = 50;
        //System.out.println(d);//50.0
        int i5= (int)d;
        System.out.println(d);

        double d2 = 40;
        byte b3 = (byte)d2;
        System.out.println(d2);
        System.out.println(b3);

        //When numbers outside the range data loss'
        int i6 = 40;
        byte b4 = (byte)i6; //explicit/manual/
        System.out.println(i6);
        System.out.println(b4);

        double d3 = 45.56;
        int i7 =  (int)d3;
        System.out.println(d3);
        System.out.println(i7);


     }
}
