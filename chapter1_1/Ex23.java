package chapter1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Ex23 {
    public static int BinarySearch(int key, int[] a) {
        return indexof(key, a);
    }

    public static int indexof(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] allowlist = in.readAllInts();
        Arrays.sort(allowlist);

        char s = StdIn.readChar();

        System.out.println("Input keys: ");
        StdIn.readLine();
        String[] keys = StdIn.readLine().split(" ");


        for (String key : keys) {
            if (BinarySearch(Integer.parseInt(key), allowlist) != -1 && s == '-') {
                System.out.printf("%s ", key);
            } else if (BinarySearch(Integer.parseInt(key), allowlist) == -1 && s == '+') {
                System.out.printf("%s ", key);
            }
        }
    }
}


