package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex11_EvaluatePostfix {

    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("+")) {
                double valPost = vals.pop();
                double valPre = vals.pop();
                double temp = valPre + valPost;
                vals.push(temp);
            } else if (s.equals("-")) {
                double valPost = vals.pop();
                double valPre = vals.pop();
                double temp = valPre - valPost;
                vals.push(temp);
            } else if (s.equals("*")) {
                double valPost = vals.pop();
                double valPre = vals.pop();
                double temp = valPre * valPost;
                vals.push(temp);
            } else if (s.equals("/")) {
                double valPost = vals.pop();
                double valPre = vals.pop();
                double temp = valPre / valPost;
                vals.push(temp);
            } else {
                double temp = Double.parseDouble(s);
                vals.push(temp);
            }
        }
        StdOut.println(vals.pop());
    }
}
