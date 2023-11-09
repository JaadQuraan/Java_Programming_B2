package day31_custom_classes;

public class UsingPhone {

    public static void main(String[] args) {

        Phone phone1 = new Phone("iPhone X");
        System.out.println(phone1);

//        Phone phone2 = new Phone();
// Since we have defined other constructors we cannot call this unless
// it is also defined

        Phone phone2 = new Phone("iPhone 14","Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("iPhone 12","Apple", 512,20.2);
        System.out.println(phone3);
    }
}
