package day35_inheritance.person;

public class Runner {
    public static void main(String[] args) {


        Person objOne = new Person();
        objOne.name = "Eyad";
        objOne.age = 25;
        objOne.favoriteHobby = "Java";
        objOne.talk();
        //can change name. default access modifier.
        // Accessible in same class and package
        //objOne.study() method is in child class and nothing
        // inherits from child to parent

        Student studentOne = new Student();
        studentOne.name = "Valentina";
        studentOne.age = 23;
        studentOne.favoriteHobby = "Of course Java";
        studentOne.talk();
        studentOne.study();
        studentOne.grades = 'A';

        System.out.println(studentOne.grades);


    }
}
