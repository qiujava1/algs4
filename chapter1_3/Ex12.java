package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex12 {

    public static Stack<String> copy(Stack<String> stack) {
        Stack<String> copyStack = new Stack<String>();
        Stack<String> tempStack = new Stack<String>();
        for (String s : stack) {
            tempStack.push(s);
        }
        for (String s : tempStack) {
            copyStack.push(s);
        }
        return copyStack;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Stack<String> copystack = new Stack<String>();
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readString());
        }
        copystack = copy(stack);
        for (String s : copystack) {
            StdOut.print(s + " ");
        }
        StdOut.println();
    }
}
