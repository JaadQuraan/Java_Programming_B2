package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal animalOne = new Animal();

        //Assign values to objects instance variables
        animalOne.species = "birds";
        animalOne.population = 1_000_000_000_000L;

        //If we want to print out the object directly we must decalre a
        // method called toString in the class
        System.out.println(animalOne); //Printing the object
        //If you want to print object itself have to use toString
        //Right click->Generate->toString()
        System.out.println("Species: "+animalOne.species); // Printing the instance variable

//        System.out.println(animalOne.toString());
//        This is not the way to use with this toString method
    }
}
