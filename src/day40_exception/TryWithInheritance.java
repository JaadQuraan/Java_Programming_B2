package day40_exception;


/**
 * Parent class cannot be before the child class
 */
public class TryWithInheritance {
    public static void main(String[] args) {


        try {

        }catch (IndexOutOfBoundsException e){

        } catch (RuntimeException e){

        }catch (Exception e){

        }

        IndexOutOfBoundsException e = new IndexOutOfBoundsException();
        RuntimeException e2 = new IndexOutOfBoundsException();
        Exception e3 = new IndexOutOfBoundsException();
        //Reference type can be itself, any super classes or any interface




    }
}
