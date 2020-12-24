package chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex02 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] interval1Ds = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            interval1Ds[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }

        if (N > 2) {
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (interval1Ds[i].intersects(interval1Ds[j]))
                        StdOut.println(interval1Ds[i] + " intersects " + interval1Ds[j]);
                }
            }
        }
    }
}
