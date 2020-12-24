package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex03 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        if (n1 == n2 && n1 == n3) {
            StdOut.println("equal");
        } else
            StdOut.println("not equal");
    }
}
