package chapter1_3;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;


public class SLList<Item> implements Iterable<Item> {
    private Node sentinel;
    private Item sentinelItem;
    private int size;

    private class Node {
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public SLList() {
        sentinel = new Node(sentinelItem, null);
        size = 0;
    }


    public SLList(Item item) {
        sentinel = new Node(sentinelItem, null);
        sentinel.next = new Node(item, null);
        size = 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(Item item) {
        sentinel.next = new Node(item, sentinel.next);
        size++;
    }

    public void addLast(Item item) {
        Node p = sentinel;
        while (p.next != null)
            p = p.next;
        p.next = new Node(item, null);
        size++;
    }

    public void removeLast() {
        Node p = sentinel;
        if (sentinel.next == null) {
            StdOut.println("Empty List");
            return;
        }
        /* get the second last of the list*/
        while (p.next.next != null)
            p = p.next;
        p.next = null;
        size--;
    }

    public void removeIthNode(int N) {
        Node p = sentinel;
        if (N > size && N <= 0) {
            StdOut.println("Error Input;");
            return;
        }
        for (int i = 0; i < N - 1; i++) {
            p = sentinel.next;
        }
        p.next = p.next.next;
    }

    public void remove(Item item) {
        if (sentinel.next == null) {
            StdOut.println("Empty List");
            return;
        }
        for (Node p = sentinel.next; p.next != null; p = p.next) {
            if (p.next.item == item) {
                p.next = p.next.next;
            }
        }
        
    }

    public boolean find(Item item) {
        for (Node p = sentinel.next; p.next != null; p = p.next) {
            if (p.item == item) {
                return true;
            }
        }
        return false;
    }

    public void removeAfter(Node node) {
        if (node == null || node.next == null) return;
        for (Node p = sentinel.next; p.next != null; p = p.next) {
            if (p == node) {
                p.next = p.next.next;
                size--;
                return;
            }
        }
    }

    public void insertAfter(Node node1, Node node2) {
        if (node1 == null || node2 == null) return;
        Node temp = node1.next;
        node1.next = node2;
        node2.next = temp;
    }


    public Item getFirst() {
        return sentinel.next.item;
    }

    public Iterator<Item> iterator() {
        return new SLListIterator();
    }


    private class SLListIterator implements Iterator<Item> {
        private Node current = sentinel.next;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        SLList<String> SLList = new SLList<String>();
        SLList.addFirst("a");
        SLList.addFirst("b");
        SLList.addFirst("c");
        SLList.addFirst("d");

//        while (!StdIn.isEmpty()) {
//            SLList.addLast(StdIn.readString());
//        }
        StdOut.println(SLList.find("b"));

        for (String s : SLList) {
            StdOut.print(s + " ");
        }
        StdOut.println();
        SLList.removeLast();
        for (String s : SLList) {
            StdOut.print(s + " ");
        }
        StdOut.println();
        SLList.removeIthNode(2);
        for (String s : SLList) {
            StdOut.print(s + " ");
        }
        StdOut.println();
        StdOut.println(SLList.find("b"));
    }

}
