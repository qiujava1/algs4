package chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex24 {
    public static int Euclid(int p, int q) {
        StdOut.printf("%4d %4d", p, q);
        StdOut.println();
        if (q == 0) return p;
        return Euclid(q, p % q);
    }

    public static void main(String[] args) {
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        StdOut.println(Euclid(p, q));
    }
}
