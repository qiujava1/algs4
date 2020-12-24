package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex09 {
    public static void main(String[] args) {
        Stack<String> stackOp = new Stack<String>();
        Stack<String> stackVal = new Stack<String>();
        String s = StdIn.readString();
        String[] input = s.split("");
        for (String s1 : input) {
            if (s1.equals("+") || s1.equals("-") || s1.equals("*") || s1.equals("/")) stackOp.push(s1);
            else if (s1.equals(")")) {
                String valPost = stackVal.pop();
                String valPre = stackVal.pop();
                String val = " ( " + valPre + " " + stackOp.pop() + " " + valPost + " ) ";
                stackVal.push(val);
            } else
                stackVal.push(s1);
        }

        String res = stackVal.pop();
        StdOut.println(res);
    }
}
