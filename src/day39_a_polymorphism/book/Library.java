package day39_a_polymorphism.book;

public class Library {

    public static void main(String[] args) {
        JavaTextBook book1 = new JavaTextBook(); //2 instance variables, 2 methods
        book1.name = "Java Programming";
        book1.size =20.0;
        book1.isfun = true;

        book1.download();
        book1.open();
        book1.read();

        EBook book2 = new JavaTextBook();
        book2.name = "Java Programming 2";
        book2.size = 30.5;
        //book2.isfun = false. Will not work
        //Ebook reference does not have access to isFun variable
        ((JavaTextBook)book2).isfun =false;
        //casted the reference from the parent which is Ebook to the child reference of JavaTextBook
        // Allows us to access the isFun variable
        System.out.println();
        book2.open();
        book2.download();
        book2.read();
        //Object is running the overridden version from a child class
        //ref has access to all 3
        System.out.println(book2.name);
        System.out.println(book2.size);
        System.out.println(((JavaTextBook) book2).isfun);

        Book book3 = new JavaTextBook();
        book3.name = "Java Programming 3";
        ((JavaTextBook) book3).size = 40.5;
        ((JavaTextBook)book3).isfun = true;

        book3.read();
        ((JavaTextBook) book3).open();
        ((JavaTextBook) book3).download();

//        book3.size = 40.5;
//        book3.isFun = true;
//        book3.open
//        book3.download
        //These will not work Book does not have access. Only to name and read

        Downloadable book4 = new JavaTextBook();
//        book4.name = "J P-4";
//        book4.name = "Java Programming";
//        book4.size =20.0;
//        book4.isfun = true;
//        book4.open();
        book4.download(); //The only thing book4 has access to is download() method which is in the Downloadable interface which is the reference
//        book4.read();

        JavaTextBook book5 = (JavaTextBook) book4;
        //Casted book4 to JavaTextBook
        book5.read();
        book5.download();
        book5.open();

        //book4.read(); //Still will not work
        //Dont think you have changed the ref of book4


    }
}
