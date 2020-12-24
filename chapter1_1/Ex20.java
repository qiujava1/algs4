package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex20 {


    public static double lnOfFactorial(int N) {
        if (N == 1) return 0;
        return (Math.log(N) + lnOfFactorial(N - 1));
    }

    public static void main(String[] args) {
        StdOut.println(lnOfFactorial(10));
        StdOut.println(lnOfFactorial(11));
    }
}
