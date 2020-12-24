package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class ResizingArrayStackOfItem {


    public static class ResizingArrayStack<Item> implements Iterable<Item> {
        private int N = 0;
        private Item[] a = (Item[]) new Object[1];

        public void resize(int max) {
            Item[] temp = (Item[]) new Object[max];
            for (int i = 0; i < N; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        public void push(Item item) {
            if (a.length == N) {
                resize(2 * a.length);
            }
            a[N++] = item;
        }

        public Item pop() {
            Item item = a[--N];
            a[N] = null;
            if (N > 0 && N == a.length / 4) resize(a.length / 2);
            return item;
        }

        public Iterator<Item> iterator() {
            return new ReverseArrayIterator();
        }

        public class ReverseArrayIterator implements Iterator<Item> {
            private int i = N;

            public boolean hasNext() {
                return i > 0;
            }

            public Item next() {
                return a[--i];
            }

            public void remove() {
                ;
            }

        }
    }

    public static void main(String[] args) {
        ResizingArrayStack<String> s = new ResizingArrayStack<String>();
        while (!StdIn.isEmpty()) {
            String Item = StdIn.readString();
            if (!Item.equals("-")) {
                s.push(Item);
            } //else if (!Item.isEmpty()) StdOut.print(s.pop() + " ");
        }

        for (String s1 : s) {
            StdOut.print(s1 + " ");
        }
        StdOut.println();
        //StdOut.println("(" + s.size() + " left on stack)");
    }

}
