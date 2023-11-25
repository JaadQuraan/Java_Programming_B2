package day39_a_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //#1 - REFERENCE is ITSELF - same class
        Lizard lizard = new Lizard();
        lizard.eat();
        //lizard has access to 3 variables
        lizard.name = "lizard";
        lizard.numberOfClaws =10;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);
        System.out.println();

        //#2 - Reference is SUPER Class > Parent class
        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "reptile";
        reptile.numberOfClaws = 10;
      //  reptile.skinColor = "green"; Reptile reference does not have access to skinColor variable
        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);
        System.out.println();
        //#2 - Reference is SUPER Class > Parent class
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "animal";
        //Eating method asll 3 say LIZARD because it runs the version that is in the object
//        animal.numberOfClaws = 10;
//        animal.skinColor = "red";
    //Animal reference does not have access to skinColor variable or numberOfClaws variable

        /*
        We made 3 Lizard objects with 3 different references
        Lizard(ITSELF)
        Reptile(SUPER class)
        Animal(Super class)
         */


        //Polymorphism is used to restrict access. Left side is reference side. Right side is object side which will be run always

//        new Lizard().name = "Test";
//        System.out.println(lizard.name);
        //This does not work because there is no reference to new Lizard().name "Test"
        //New keyword creates a brand new object
        System.out.println();
        //#1 Reference is itself
        Reptile reptile2 = new Reptile();
        reptile2.eat();
        System.out.println();
        //#2 Reference is super class
        Animal animal2 = new Reptile();
        animal2.eat();
        //Reptile is eating. It runs the object one


        /*
        WebDriver driver = new ChromeDriver();
            Limiting access
        ChromeDriver driver2 = new ChromeDriver();
         */

    }
}
