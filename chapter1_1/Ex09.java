package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex09 {
    public static String toBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s += n % 2;
        return s;
    }

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        StdOut.println(toBinaryString(n1));
    }
}
