package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex14 {
    public static int pow(int x, int y) {
        int temp = 1;
        for (int i = 0; i < y; i++) {
            temp *= x;
        }
        return temp;
    }

    public static int lg(int N) {
        int i = 0;
        while (pow(2, i) <= N)
            i++;
        i--;
        return i;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a <= 0) {
            StdOut.println("inputError");
        } else {
            StdOut.println(lg(a));
        }
    }
}
