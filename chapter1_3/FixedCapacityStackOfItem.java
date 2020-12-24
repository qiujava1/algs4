package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfItem {

    public static class FixedCapacityStack<Item> {

        private Item[] a;
        private int N;

        public FixedCapacityStack(int cap) {
            a = (Item[]) new Object[cap];
        }

        public boolean isEmpty() {
            return N == 0;
        }

        public int size() {
            return N;
        }

        public void push(Item item) {
            a[N++] = item;
        }

        public Item pop() {
            return a[--N];
        }
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
        while (!StdIn.isEmpty()) {
            String Item = StdIn.readString();
            if (!Item.equals("-")) {
                s.push(Item);
            } else if (!Item.isEmpty()) StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + " left on stack)");
    }

}
