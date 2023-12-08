package day44_map_and_functions.functional_interface;
@FunctionalInterface
public interface DynamicInterface <T>{
    void test(T t); //Generics usually marked as T t
                            //T is generic type(It can accept any data type) t is parameter name
}
