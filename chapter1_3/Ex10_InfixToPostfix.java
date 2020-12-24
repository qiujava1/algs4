package chapter1_3;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//"*" "/"  "(" 直接入栈 "+" "-" 权重小于 "*" "/" 若栈顶为"*" "/" 需pop出直到权重小于"+""-"  ")"pop栈内元素直到"("
public class Ex10_InfixToPostfix {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        String res = "";
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "+":
                case "-":
                    while (!stack.isEmpty() && (stack.peek().equals("*") || stack.peek().equals("/"))) {
                        res = res + " " + stack.pop() + " ";
                    }
                    stack.push(s);
                    break;
                case "*":
                case "/":
                case "(":
                    stack.push(s);
                    break;
                case ")":
                    while (!stack.peek().equals("(")) {
                        res = res + " " + stack.pop() + " ";
                    }
                    stack.pop();
                    break;
                default:
                    res = res + " " + s + " ";
            }
        }
        for (String s : stack)
            res = res + " " + s + " ";

        StdOut.println(res);
    }
}
