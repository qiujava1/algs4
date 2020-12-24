package chapter1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex06 {
    public static void main(String[] args) {
        StdOut.println("input s: ");
        String s = StdIn.readLine();
        StdOut.println("input t: ");
        String t = StdIn.readLine();
        if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {
            StdOut.println(s + " is the circular rotation of " + t);
        } else {
            StdOut.println(s + " is not the circular rotation of " + t);
        }
    }
}
