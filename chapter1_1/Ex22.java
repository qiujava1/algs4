package chapter1_1;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Ex22 {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            StdOut.print(" ");
        }
        StdOut.println("lo=" + lo + " hi=" + hi);
        if (lo > hi) return -1;
        int mid = lo + hi / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, depth + 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, depth + 1);
        else return mid;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 7, 8, 9, 12, 21, 20, 17, 33, 24, 98, 101, -5, -3, -7};
        Arrays.sort(a);
        int key = 5;
        rank(key, a);
    }
}
