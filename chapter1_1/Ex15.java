package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex15 {
    public static int count(int key, int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                temp++;
            }
        }
        return temp;
    }

    public static int[] histrogram(int M, int[] a) {
        int[] res = new int[M];
        for (int i = 0; i < res.length; i++) {
            res[i] = count(i, a);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 3, 4, 5, 2, 7, 3, 4, 6, 7, 2, 3};
        int M = 10;
        int[] res = histrogram(M, a);
        for (int i = 0; i < res.length; i++)
            StdOut.print(res[i]);
        StdOut.println();
    }
}
