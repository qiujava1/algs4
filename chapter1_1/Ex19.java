package chapter1_1;

//public class Ex19 {
//
//    public static long F(int N) {
//        if (N == 0) return 0;
//        if (N == 1) return 1;
//        return F(N - 1) + F(N - 2);
//    }
//
//    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++)
//            StdOut.println(N + " " + F(N));
//    }
//
//}

import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;

public class Ex19 {
    static ArrayList<Long> Fibonacci = new ArrayList<Long>();

    public static long F(int N) {
        long res = Fibonacci.get(N - 1) + Fibonacci.get(N - 2);
        Fibonacci.add(res);
        return res;
    }

    public static void main(String[] args) {
        Fibonacci.add((long) 0);
        Fibonacci.add((long) 1);
        for (int N = 2; N < 100; N++) {
            StdOut.println(N + " " + F(N));
        }
    }
}
