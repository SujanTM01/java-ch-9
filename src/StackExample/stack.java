package StackExample;
import java.util.Stack;
public class stack {
    /*Write a Java program to use Stack for storing the custom class
objects and use following functions:
- size()
- isEmpty()
- push()
- pop()
- peek()
- search() */
    public static void main(String[] args) {
        Stack<String> carStack = new Stack<>();
        System.out.println("Stack size"+carStack.size());
        System.out.println("Stack isEmpty:"+carStack.isEmpty());
        carStack.push("Tesla");
        System.out.println("Stack Size:"+carStack.size());
        System.out.println("Stack isEmpty:"+carStack.isEmpty());
        carStack.push("BMW");
        System.out.println("Stack:"+carStack);
        System.out.println("Stack size:"+carStack.size());
        System.out.println("pop Data:"+carStack.pop());
        System.out.println("Stack size:"+carStack.size());
        carStack.push("Nexus");
        System.out.println("peek data:"+carStack.peek());
        System.out.println("Stack size:"+carStack.size());
        System.out.println("Stack:"+carStack);
        System.out.println("Search position:"+carStack.search("Tesla"));
    }
}

