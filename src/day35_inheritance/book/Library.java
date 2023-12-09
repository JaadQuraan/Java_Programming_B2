package day35_inheritance.book;

public class Library {
    public static void main(String[] args) {
        Book b1 = new Book();
        //b1 has access to 5 instance variables
        //b1.title = "Lord of the Rings";

        AudioBook ab1 = new AudioBook();
    //ab1 has access to 8 instance variables
        //6 from super class
        //2 from its own class
        ab1.title = "The Lion";
        ab1.duration = 100;
        ab1.narrator = "Tom Jerry";
        ab1.author = new Author("Mickey Mouse",40);
        //Create an obj of Author class and assigned it to instance variable of ab1 object which is Author author
        //ab1 has access to 1 instance method in its own class
        ab1.listen();

        Ebook eb1 = new Ebook();
        //eb1 has access to 7 instance variables
        //6 from super class
        //1 from its own class
        //1 instance method which is in its own class
        eb1.read();


        //Created new object from Author class and assigned it to author a1 reference
        Author a1 = new Author("Winnie",-10);
        System.out.println(a1.getAge());
        //a1.title = "Hello"; Author no is a relation
    }
}
