package day37_a_abstraction.exercise;

public class PushUp extends Exercise{

    public PushUp(){
        super("PushUp");
    }
    public int caloriesBurned(int min){
        //still overriding. Name and datatype matter not variable name
        return  min*2;
    }

    @Override
    public void performExercise() {
        System.out.println("Doing push ups on floor");
    }
    @Override
    public void generalInfo(){
        System.out.println(name + " exercise is better for your health");
    }
}
