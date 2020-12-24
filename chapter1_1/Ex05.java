package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex05 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        StdOut.println(x >= 0 && x <= 1 && y >= 0 && y <= 1);
    }
}
