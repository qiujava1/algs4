package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex04_Parentheses {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        String item = StdIn.readString();
        String[] input = item.split("");
        for (String s1 : input) {
            if (!s1.equals("}") && !s1.equals("]") && !s1.equals(")"))
                s.push(s1);
            else if (!s.isEmpty()) {
                if (s1.equals("}")) {
                    String s2 = s.pop();
                    if (!s2.equals("{")) {
                        StdOut.println("false");
                        return;
                    }
                } else if (s1.equals("]")) {
                    String s2 = s.pop();
                    if (!s2.equals("[")) {
                        StdOut.println("false");
                        return;
                    }
                } else if (s1.equals(")")) {
                    String s2 = s.pop();
                    if (!s2.equals("(")) {
                        StdOut.println("false");
                        return;
                    }
                }
            }
        }
        if (s.isEmpty()) StdOut.println("true");
    }
}
