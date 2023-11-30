package day40_exception.throws_keyword;

public class UsingPerson {
    public static void main(String[] args) {

        Person obj = new Person();
        //obj.setName("Tom Jerry");
        try {
            //obj.setName("");
            obj.setName("Tom Jerry");
        } catch (Exception e){
            e.printStackTrace();
        }


     //   System.out.println("obj.getName() = " + obj.getName()); //null
        //Not able to assign "" in the try catch so it stays null
        //throws Exception is avoiding handling it

        try {
          //  obj.setAge(-50);
            obj.setAge(-50);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Object Name: " + obj.getName());
        System.out.println("Object age: " + obj.getAge());
        System.out.println("DONE");


    }
}
