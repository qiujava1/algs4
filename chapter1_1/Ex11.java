package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex11 {
    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i + j) % 2 == 1) a[i][j] = true;
                else a[i][j] = false;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i][j]) StdOut.print("*");
                else StdOut.print(" ");
            }
            StdOut.println();
        }
    }
}
