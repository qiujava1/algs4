package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class ResizingArrayQueueOfItem {

    public static class ResizingArrayQueue<Item> implements Iterable<Item> {
        private Item[] a = (Item[]) new Object[1];
        private int N;

        public void resizing(int max) {
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

        public void enqueue(Item item) {
            if (N == a.length) resizing(a.length * 2);
            a[N++] = item;
        }

        public Item dequeue() {
            Item item = a[0];
            for (int i = 0; i < N; i++) {
                a[i] = a[i + 1];
            }
            N--;
            if (N > 0 && N == a.length / 4) resizing(a.length / 2);
            return item;
        }

        public Iterator<Item> iterator() {
            return new QueueIterator();
        }

        public class QueueIterator implements Iterator<Item> {
            private int i = N;

            public boolean hasNext() {
                return i > 0;
            }

            public Item next() {
                return a[++i];
            }

            public void remove() {
            }
        }
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        ResizingArrayQueue<String> s = new ResizingArrayQueue<String>();
        while (!StdIn.isEmpty()) {
            String s1 = StdIn.readString();
            s.enqueue(s1);
        }
        String s2 = "";
        for (int i = 0; i < s.size() - N; i++) {
            s2 = s.dequeue();
        }
        StdOut.println(s2);
    }

}
