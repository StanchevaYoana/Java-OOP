package StackOfStrings;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push("Yoana");
        stack.push("Daria");
        stack.push("Stani");
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
    }
}
