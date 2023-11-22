package day37_a_abstraction.exercise;

public class Running extends Exercise{

    public Running(){
       super("Running");
    }

    @Override
    public void performExercise() {
        System.out.println("Running on treadmill");
    }
    @Override
    public void generalInfo(){
        System.out.println(name + " exercise is better for your health");
    }
    @Override
    public int caloriesBurned(int min){
        //still overriding. Name and datatype matter not variable name
        return  min*5;
    }
}
