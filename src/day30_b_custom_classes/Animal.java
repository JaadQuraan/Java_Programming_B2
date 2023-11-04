package day30_b_custom_classes;

public class Animal {
    String species;
    long population;

//    @Override - optional can delete it
//    public String toString() {
//        return "Animal{" +
//                "species='" + species + '\'' +
//                ", population=" + population +
//                '}';
//    }

    //If you want to print object itself have to use toString
    //Right click->Generate->toString()
    public String toString (){
        return "Animal name: " + species
                + "\nAnimal Population: " + population;
    }
    //This is not custom method. This comes from object class
}
