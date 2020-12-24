package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex17 {
    public static String exR2(int n) {
        if (n <= 0) return "";
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        return s;
    }

    public static void main(String[] args) {
        StdOut.println(exR2(6));
    }
}
