package day41_collection.collect;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.println(stack);

        System.out.println("Top of the stack: " + stack.peek()); //d think of it like putting books in a box. Last element
    //    stack.pop(); //rmoves the element at the top of the stack and returns it
        System.out.println(stack.pop()); //returns the removed element. Here 'd'
        System.out.println(stack); //[a, b, c]

        System.out.println(stack.pop()); // c
        System.out.println(stack); // [a,b]

        System.out.println(stack.remove(0));  //
        // Since Stack can have the inheritance from List, Collection as well, we can use the remove(index) method as well
        // But this will not make us to use the specific character of the Stack class.
        // Specific character of the Stack class is: LIFO -- > Last In First Out
        System.out.println(stack);

        //dont use stack if you wanna remove from the bottom

    }
}
