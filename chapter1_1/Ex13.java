package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex13 {

    public static void printTransposition(int[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                StdOut.printf("%4d", a[j][i]);
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        printTransposition(a);
    }
}
